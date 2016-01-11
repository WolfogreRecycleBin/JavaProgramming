package SocketTcpServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/09/2016.
 */
public class ServiceThread extends Thread {
	Socket socket;
	Scanner scanner;
	PrintWriter printWriter;
	public ServiceThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run(){
		try{
			System.out.println("New connection: :"+socket.getInetAddress()+":"+socket.getPort());
			scanner = new Scanner(socket.getInputStream());
			printWriter = new PrintWriter(socket.getOutputStream());
			while(true){
				if(!scanner.hasNext())
					break;
				String str = scanner.nextLine();
				if(str.equals("bye"))
					break;
				if(str.equals("hello")){
					printWriter.println("hello");
					printWriter.flush();
					continue;
				}
				if(str.equals("time")){
					Date now = new Date();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
					String timeStr = dateFormat.format(now);
					printWriter.println("time is " + timeStr);
					printWriter.flush();
					continue;
				}
				printWriter.println("what?");
				printWriter.flush();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				System.out.println("Disconnect::"+socket.getInetAddress()+":"+socket.getPort());
				if(socket != null && socket.isConnected())
					socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
