package SocketTCP;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class StartClient {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Address:");
		InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getByName(scanner.nextLine());
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return;
		}
		System.out.print("port:");
		int port = scanner.nextInt();
		Client client = new Client(inetAddress, port);
		client.connect();
		while (true) {
			String str = scanner.nextLine();
			if (str.equals("bye")) {
				client.send("bye");
				client.disconnect();
				break;
			}
			client.send(str);
		}
	}
}
