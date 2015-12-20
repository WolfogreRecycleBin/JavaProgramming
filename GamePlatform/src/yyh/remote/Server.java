package yyh.remote;


import yyh.play.Player;
import yyh.play.PlayerHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket;
        Room room = new Room();
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("服务器启动成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (true) {
                socket = serverSocket.accept();
                Player p = new Player(socket);
                room.addPlayer(p);
                new PlayerHandler(room,p).start();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
