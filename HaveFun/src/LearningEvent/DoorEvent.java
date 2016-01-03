package LearningEvent;


import java.util.EventObject;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/03/2016.
 */
public class DoorEvent extends EventObject{

	public String name;
	public int id;

	/**
	 * Constructs a prototypical Event.
	 *
	 * @param source The object on which the Event initially occurred.
	 * @throws IllegalArgumentException if source is null.
	 */
	public DoorEvent(Object source, String name, int id) {
		super(source);
		this.name = name;
		this.id = id;
	}
}
