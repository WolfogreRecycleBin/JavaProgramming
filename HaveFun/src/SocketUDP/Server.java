package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class Server {
	/**
	 * ����˿ں�
	 */
	int port;
	/**
	 * �����׽���
	 */
	DatagramSocket serverSocket;
	
	/**
	 * ��������
	 * @param port ����ķ���˿ں�
	 */
	public Server(int port){
		this.port = port;
	}
	
	/**
	 * ���������
	 * @throws Exception �׽����쳣
	 */
	public void startServer() throws Exception{
		try{
			serverSocket = new DatagramSocket(port);
		}catch(Exception ex){
			throw new Exception("�򿪷����ʧ��:" + ex.getMessage(), ex);
		}
		System.out.println("������ַ:" + InetAddress.getLocalHost() + ";�˿�:" + port + ",���������...");
		try{
            System.out.println("����˼�����...");
            while(true){
        		byte[] receiveData = new byte[1024];
                byte[] sendData;
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                
            	serverSocket.receive(receivePacket);
                String reveiveStr = new String( receivePacket.getData());
                reveiveStr = reveiveStr.substring(0,reveiveStr.indexOf(0));
                System.out.println((new Date()) + "����:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                System.out.println("�յ�\"" + reveiveStr + "\"");
                
                String sendStr = "ȷ��:" + reveiveStr;
                sendData = sendStr.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, receivePacket.getAddress(), receivePacket.getPort());
                serverSocket.send(sendPacket);
                System.out.println((new Date()) + "ȥ��:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                System.out.println("����\"" + sendStr + "\"");
                
                if(reveiveStr.equals("endserver")){
                	byte[] endData;
                	String endStr = "�رշ����";
                	endData = endStr.getBytes();
                    DatagramPacket endPacket = new DatagramPacket(endData, endData.length, receivePacket.getAddress(), receivePacket.getPort());
                    serverSocket.send(endPacket);
                    System.out.println((new Date()) + "ȥ��:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
                    System.out.println("����\"" + endStr + "\"");
                    break;
                }
            }
            serverSocket.close();
		}catch(Exception ex){
			throw new Exception("����˱���:" + ex.getMessage(), ex);
		}
		
	}
}
