package SocketTCP;

import java.io.IOException;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class StartServer {
	public static void main(String args[]){
		Server server = new Server(6789);
		server.run();
	}
}
