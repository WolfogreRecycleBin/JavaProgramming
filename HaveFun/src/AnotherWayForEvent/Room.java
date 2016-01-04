package AnotherWayForEvent;


/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/04/2016.
 */
public abstract class Room {
	String name;
	int id;
	boolean isDoorOpen;

	public Room(String name, int id){
		this.name = name;
		this.id = id;
		isDoorOpen = false;
	}

	final public boolean openDoor(String who){
		if(isDoorOpen)
			return  false;
		isDoorOpen = true;
		System.out.println(who + " opened " + name + " in " + id);
		onOpenDoor();
		return true;
	}

	final public boolean closeDoor(String who){
		if(!isDoorOpen)
			return  false;
		isDoorOpen = false;
		System.out.println(who + " closed " + name + " in " + id);
		onCloseDoor();
		return true;
	}

	protected abstract void onOpenDoor();
	protected abstract void onCloseDoor();
}
