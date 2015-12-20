package yyh.play;

import yyh.remote.Room;

import java.io.IOException;
import java.net.SocketException;

/**
 * A playerhandler is a thread read a object and send it to all other players who are in the same room
 */
public class PlayerHandler extends Thread {
    private Room room;

    private Player player;

    /**
     * Construct a playerhandler by a player and the room the player in
     * @param room
     * @param player
     */
    public PlayerHandler(Room room,Player player){
        this.room = room;
        this.player = player;
    }

    /**
     * This player send object method
     * @param obj
     */
    private void send(Object obj){
        room.send(obj);
    }

    /**
     * The thread method to read an object for loop
     */
    public void run(){
        Object message;
        while(true){
            try {
                while ((message = player.get()) != null) {
                    send(message);
                }
            }catch (Exception e){
                e.printStackTrace();
                return;
            }
        }
    }
}
