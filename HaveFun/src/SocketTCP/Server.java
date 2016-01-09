package SocketTCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class Server {
	int port;
	boolean needStop;
	ServerSocket serverSocket;
	public Server(int port){
		this.port = port;
		needStop= false;
	}
	public void run(){
		try{
			serverSocket = new ServerSocket(this.port);
			while(!needStop){
				Socket socket = serverSocket.accept();
				Thread workThread=new ServiceThread(socket);
				workThread.start();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				System.out.println("Stop server::"+serverSocket.getInetAddress()+":"+serverSocket.getLocalPort());
				if(serverSocket != null && !serverSocket.isClosed())
					serverSocket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
