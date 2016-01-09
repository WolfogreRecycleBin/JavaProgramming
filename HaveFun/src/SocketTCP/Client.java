package SocketTCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class Client {
	InetAddress inetAddress;
	int port;
	Socket socket;
	public Client(InetAddress inetAddress, int port){
		this.inetAddress =inetAddress;
		this.port =port;
	}

	public void connect() {
		try {
			socket = new Socket(inetAddress , port);
			ListenThread listenThead = new ListenThread(socket);
			listenThead.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try{
			System.out.println("Disconnect::"+socket.getInetAddress()+":"+socket.getPort());
			if(socket != null && !socket.isConnected())
				socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void send(String string) {
		try{
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			printWriter.println(string);
			printWriter.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
