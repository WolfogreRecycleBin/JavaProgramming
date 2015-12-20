package SocketUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Scanner;

public class TestClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		DatagramSocket clientSocket = new DatagramSocket();
		System.out.print("����˵�ַ:");
		InetAddress IPAddress = InetAddress.getByName(scanner.nextLine());
		System.out.print("�˿�:");
		int port = scanner.nextInt();
	    
		while(true){
		    byte[] sendData = new byte[1024];
		    byte[] receiveData = new byte[1024];
		    
		    System.out.print("����:");
		    String sendStr = scanner.nextLine();
		    sendData = sendStr.getBytes();
		    
		    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
		    clientSocket.send(sendPacket);
            System.out.println((new Date()) + "ȥ��:"+ IPAddress + ":" + port);
            System.out.println("����\"" + sendStr + "\"");
            
		    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		    clientSocket.receive(receivePacket);
            String reveiveStr = new String( receivePacket.getData());
            reveiveStr = reveiveStr.substring(0,reveiveStr.indexOf(0));
            System.out.println((new Date()) + "����:"+ receivePacket.getAddress() + ":" + receivePacket.getPort());
            System.out.println("�յ�\"" + reveiveStr + "\"");
		}

	}

}
