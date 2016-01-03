package LearningEvent;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/03/2016.
 */
public class Room {
	String name;
	int id;
	boolean isDoorOpen;
	private Collection doorOpenListeners;
	private Collection doorCloseListeners;

	public Room(String name, int id){
		this.name = name;
		this.id = id;
		isDoorOpen = false;
	}

	public void addDoorOpenListener(DoorListener doorListener) {
		if (doorOpenListeners == null) {
			doorOpenListeners = new HashSet();
		}
		doorOpenListeners.add(doorListener);
	}

	public void addDoorCloseListener(DoorListener doorListener) {
		if (doorCloseListeners == null) {
			doorCloseListeners = new HashSet();
		}
		doorCloseListeners.add(doorListener);
	}

	private void notifyDoorOpenListeners(DoorEvent event) {
		for (Object doorOpenListener : doorOpenListeners) {
			DoorListener listener = (DoorListener) doorOpenListener;
			listener.doorEvent(event);
		}
	}

	private void notifyDoorCloseListeners(DoorEvent event) {
		for (Object doorCloseListener : doorCloseListeners) {
			DoorListener listener = (DoorListener) doorCloseListener;
			listener.doorEvent(event);
		}
	}

	public boolean openDoor(String who){
		if(isDoorOpen)
			return  false;
		isDoorOpen = true;
		System.out.println(who + " opened " + name + " in " + id);
		notifyDoorOpenListeners(new DoorEvent(this,name,id));
		return true;
	}

	public boolean closeDoor(String who){
		if(!isDoorOpen)
			return  false;
		isDoorOpen = false;
		System.out.println(who + " closed " + name + " in " + id);
		notifyDoorCloseListeners(new DoorEvent(this,name,id));
		return true;
	}
}
