package yyh.remote;

import yyh.play.Player;

import java.util.LinkedList;
import java.util.List;

/**
 * A room represents a place where some players play together in
 */
public class Room{

    public int playerNumber;

    public static final int DEFAULT_NUMBER = 2;

    List<Player> players = null;

    /**
     * Default constructor ,a room contains two players
     */
    public Room(){
        this(DEFAULT_NUMBER);
    }

    /**
     * Construct a room with the players' number
     * @param playerNumber The players' number of a room
     */
    public Room(int playerNumber){
        this.playerNumber = playerNumber;
    }

    /**
     * Add a player to this room
     * @param player The player is to be added
     */
    public void addPlayer(Player player){
        if(players == null)
            players = new LinkedList<>();
        players.add(player);
    }

    /**
     * Whether this room is full or not
     * @return
     */
    public boolean isFull(){
        return players.size() == playerNumber;
    }

    /**
     * The room send a object to all its players
     * @param obj
     */
    public void send(Object obj){
        for(Player p : players)
            p.receive(obj);
    }
}
