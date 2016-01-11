package SocketTcpClient;

import java.net.InetAddress;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/11/2016.
 */
public class WindowsClient extends Client {

	public WindowsClient(InetAddress inetAddress, int port) {
		super(inetAddress, port);
	}

	@Override
	void onReceive(String message) {
		System.out.println("Receive:" + message);
	}
}
