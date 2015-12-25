package yyh.clients;

import java.net.*;
import java.io.*;

public class Client {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",8888);
            System.out.println("连接成功");

            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());

            oos.writeObject("sdff");
            oos.flush();
            System.out.println("发送成功");

            String r = (String)ois.readObject();
            System.out.println(r);


        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

