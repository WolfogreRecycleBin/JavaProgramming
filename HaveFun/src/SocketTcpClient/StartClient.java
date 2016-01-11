package SocketTcpClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class StartClient {
	public static void main(String[] args) {
		try {
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
			Client client = new WindowsClient(inetAddress, port);

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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
