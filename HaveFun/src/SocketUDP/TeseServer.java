package SocketUDP;

public class TeseServer {

	public static void main(String[] args) throws Exception {
		Server gbs = new Server(6789);
		gbs.startServer();
	}

}
