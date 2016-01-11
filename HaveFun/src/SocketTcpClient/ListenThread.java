package SocketTcpClient;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
class ListenThread extends Thread {
	Socket socket;
	Client client;
	public ListenThread(Socket socket, Client client){
		this.socket = socket;
		this.client = client;
	}
	@Override
	public void run(){
		while(socket != null && socket.isConnected()){
			try {
				Scanner scanner = new Scanner(socket.getInputStream());
				if(scanner.hasNext()) {
					client.onReceive(scanner.nextLine());
				}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
