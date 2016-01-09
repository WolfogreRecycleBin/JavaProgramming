package SocketTCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class Sever {
	int port;
	boolean needStop;
	ServerSocket serverSocket;
	public Sever(int port){
		this.port = port;
		needStop= false;
	}
	public void run() throws IOException {
		serverSocket = new ServerSocket(this.port);
		serverSocket.setSoTimeout(1000);
		while(!needStop){
			Socket socket = serverSocket.accept();
			Thread workThread=new Thread();
		}
	}
}
