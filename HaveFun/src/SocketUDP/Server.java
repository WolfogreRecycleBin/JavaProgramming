package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class Server {
	/**
	 * 服务端口号
	 */
	int port;
	/**
	 * 服务套接字
	 */
	DatagramSocket serverSocket;
	
	/**
	 * 构造服务端
	 * @param port 分配的服务端口号
	 */
	public Server(int port){
		this.port = port;
	}
	
	/**
	 * 启动服务端
	 * @throws Exception 套接字异常
	 */
	public void startServer() throws Exception{
		try{
			serverSocket = new DatagramSocket(port);
		}catch(Exception ex){
			throw new Exception("打开服务端失败:" + ex.getMessage(), ex);
		}
		System.out.println("主机地址:" + InetAddress.getLocalHost() + ";端口:" + port + ",服务端启动...");
		try{
            System.out.println("服务端监听中...");
            while(true){
        		byte[] receiveData = new byte[1024];
                byte[] sendData;
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                
            	serverSocket.receive(receivePacket);
                String reveiveStr = new String( receivePacket.getData());
                reveiveStr = reveiveStr.substring(0,reveiveStr.indexOf(0));
                System.out.println((new Date()) + "来自:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                System.out.println("收到\"" + reveiveStr + "\"");
                
                String sendStr = "确认:" + reveiveStr;
                sendData = sendStr.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
                System.out.println((new Date()) + "去往:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                System.out.println("发送\"" + sendStr + "\"");
                
                if(reveiveStr.equals("endserver")){
                	byte[] endData;
                	String endStr = "关闭服务端";
                	endData = endStr.getBytes();
                    DatagramPacket endPacket = new DatagramPacket(endData, endData.length, receivePacket.getAddress(), receivePacket.getPort());
                    serverSocket.send(endPacket);
                    System.out.println((new Date()) + "去往:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                    System.out.println("发送\"" + endStr + "\"");
                    break;
                }
            }
            serverSocket.close();
		}catch(Exception ex){
			throw new Exception("服务端崩溃:" + ex.getMessage(), ex);
		}
		
	}
}
