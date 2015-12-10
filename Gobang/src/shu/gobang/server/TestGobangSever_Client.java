package shu.gobang.server;

import java.util.Scanner;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestGobangSever_Client {
	public static void main(String args[]) throws Exception{
		while(true){
			@SuppressWarnings("resource")
			Scanner inFromUser = new Scanner(System.in);
		    @SuppressWarnings("resource")
			DatagramSocket clientSocket = new DatagramSocket();
		    InetAddress IPAddress = InetAddress.getByName("115.28.191.67");
		    byte[] sendData = new byte[1024];
		    byte[] receiveData = new byte[1024];
		    String sentence = inFromUser.nextLine();
		    sendData = sentence.getBytes();
		    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 6789);
		    clientSocket.send(sendPacket);
		    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
		    clientSocket.receive(receivePacket);
		    String modifiedSentence = new String(receivePacket.getData());
		    modifiedSentence = modifiedSentence.substring(0,modifiedSentence.indexOf(0));
		    System.out.println("FROM SERVER:" + modifiedSentence);
		}
	    //clientSocket.close();
	}
}
