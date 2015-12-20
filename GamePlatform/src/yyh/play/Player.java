package yyh.play;

import yyh.helper.Validate;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * A player identify a real player by ip address and port
 */
public class Player {

    private Socket socket;

    private InetAddress address;

    private int port;

    private ObjectOutputStream oos;

    private ObjectInputStream ois;

    /**
     * Construct a player by socket
     * @param socket
     */
    public Player(Socket socket){
        Validate.notNull(socket);
        init(socket);
    }

    /**
     * Init a player's some infomation from socket
     */
    private void init(Socket socket){
        this.socket = socket;
        this.address = socket.getInetAddress();
        this.port = socket.getPort();
        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * A player read an object from the objectinputstrem
     * @return the object the player read
     */
    public Object get() throws IOException, ClassNotFoundException {
            return ois.readObject();
    }

    /**
     * A player receive an object and output it through objectoutputstream
     * @param obj the object the player receive
     */
    public void receive(Object obj){
        try {
            oos.writeObject(obj);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the player's Internet address
     * @return the InetAddress
     */
    public InetAddress getAddress(){
        return address;
    }

    /**
     * Get port
     * @return the port
     */
    public int getPort(){
        return port;
    }

    /**
     * A player exits and close some resources
     */
    public void exit(){
        if(socket!=null){
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(oos!=null){
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean equals(Player other){
        return address.equals(other.address) && port == other.port;
    }

    @Override
    public String toString(){
        return address.toString() + ":" + port;
    }
}
