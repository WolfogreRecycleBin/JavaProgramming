package SocketTcpClient;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public abstract class Client {

	InetAddress inetAddress;
	int port;
	Socket socket;
	ListenThread listenThread;

	public Client(InetAddress inetAddress, int port){
		this.inetAddress =inetAddress;
		this.port =port;
	}

	abstract  void onReceive(String message);

	final public void connect() throws IOException {
		socket = new Socket(inetAddress , port);
		listenThread = new ListenThread(socket,this);
		listenThread.start();
	}

	final public void disconnect() throws IOException {
		if(socket != null && !socket.isConnected())
			socket.close();
		listenThread.stop();
	}

	final public void send(String string) throws IOException {
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		printWriter.println(string);
		printWriter.flush();
	}
}
