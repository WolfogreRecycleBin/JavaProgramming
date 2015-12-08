package shu.gobang.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


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
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            System.out.println("����˼�����...");
            serverSocket.receive(receivePacket);
            String sentence = new String( receivePacket.getData());
            System.out.println("RECEIVED: " + sentence);
            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();
            String capitalizedSentence = sentence.toUpperCase();
            sendData = capitalizedSentence.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
		}catch(Exception ex){
			throw new Exception("����˱���", ex);
		}
		
		
	}

}
