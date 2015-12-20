package yyh.remote;

/**
 * Roommanager manages a room
 */
public class RoomManager implements Runnable {

    private Room room;

    public RoomManager(Room room){
        this.room = room;
    }

    @Override
    public void run() {

    }
}
