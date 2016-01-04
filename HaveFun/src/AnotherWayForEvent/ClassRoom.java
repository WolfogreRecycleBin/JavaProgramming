package AnotherWayForEvent;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/04/2016.
 */
public class ClassRoom extends Room {

	String threeGoodStudent;

	public ClassRoom(String name, int id, String threeGoodStudent) {
		super(name, id);
		this.threeGoodStudent = threeGoodStudent;
	}

	@Override
	protected void onOpenDoor() {
		System.out.println("Clean windows");
		System.out.println("Welcome students to " + name);
	}

	@Override
	protected void onCloseDoor() {
		System.out.println("All students in " + id + " get out");
		System.out.println("Tell " + threeGoodStudent + " don't come to " + id);
	}
}
