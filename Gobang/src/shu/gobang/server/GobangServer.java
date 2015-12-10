package shu.gobang.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.List;


/**
 * 五子棋服务端类
 * @author wolfogre
 *
 */
public class GobangServer {
	/**
	 * 服务端口号
	 */
	int port;
	/**
	 * 服务套接字
	 */
	DatagramSocket serverSocket;
	
	/**
	 * 构造五子棋服务端
	 * @param port 分配的服务端口号
	 */
	public GobangServer(int port){
		this.port = port;
	}
	
	/**
	 * 启动五子棋服务端
	 * @throws Exception 套接字异常
	 */
	public void startServer() throws Exception{
		try{
			serverSocket = new DatagramSocket(port);
		}catch(Exception ex){
			throw new Exception("打开服务端失败", ex);
		}
		System.out.println("端口:" + port + ",服务端启动...");
		byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
		try{
            System.out.println("服务端监听中...");
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            while(true){
            	serverSocket.receive(receivePacket);
                String reveiveStr = new String( receivePacket.getData());
                reveiveStr = reveiveStr.substring(0,reveiveStr.indexOf(0));
                System.out.println("收到\"" + reveiveStr + "\"from:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                String sendStr = "确认:" + reveiveStr;
                sendData = sendStr.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
                System.out.println("发送\"" + sendStr + "\"to:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
            }
		}catch(Exception ex){
			throw new Exception("服务端崩溃", ex);
		}
		
		
	}

}
