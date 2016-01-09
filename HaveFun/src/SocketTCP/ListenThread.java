package SocketTCP;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class ListenThread extends Thread {
	Socket socket;
	public ListenThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run(){
		while(socket != null && socket.isConnected()){
			try {
				Scanner scanner = new Scanner(socket.getInputStream());
				if(scanner.hasNextLine())
					System.out.println("Receive: " + scanner.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
