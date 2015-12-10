package shu.gobang.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.List;


/**
 * ������������
 * @author wolfogre
 *
 */
public class GobangServer {
	/**
	 * ����˿ں�
	 */
	int port;
	/**
	 * �����׽���
	 */
	DatagramSocket serverSocket;
	
	/**
	 * ��������������
	 * @param port ����ķ���˿ں�
	 */
	public GobangServer(int port){
		this.port = port;
	}
	
	/**
	 * ��������������
	 * @throws Exception �׽����쳣
	 */
	public void startServer() throws Exception{
		try{
			serverSocket = new DatagramSocket(port);
		}catch(Exception ex){
			throw new Exception("�򿪷����ʧ��", ex);
		}
		System.out.println("�˿�:" + port + ",���������...");
		byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
		try{
            System.out.println("����˼�����...");
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            while(true){
            	serverSocket.receive(receivePacket);
                String reveiveStr = new String( receivePacket.getData());
                reveiveStr = reveiveStr.substring(0,reveiveStr.indexOf(0));
                System.out.println("�յ�\"" + reveiveStr + "\"from:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                String sendStr = "ȷ��:" + reveiveStr;
                sendData = sendStr.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
                System.out.println("����\"" + sendStr + "\"to:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
            }
		}catch(Exception ex){
			throw new Exception("����˱���", ex);
		}
		
		
	}

}
