package LearningEvent;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/03/2016.
 */
public class TestLearningEvent {
	public static void main(String args[]){
		String threeGoodStudent = "Jason Song";
		Room classRoom = new Room("Class Room", 101);
		classRoom.addDoorOpenListener(new DoorListener() {
			@Override
			public void doorEvent(DoorEvent event) {
				System.out.println("Clean windows");
			}
		});
		classRoom.addDoorOpenListener(new DoorListener() {
			@Override
			public void doorEvent(DoorEvent event) {
				System.out.println("Welcome students to " + event.name);
			}
		});
		classRoom.addDoorCloseListener(new DoorListener() {
			@Override
			public void doorEvent(DoorEvent event) {
				System.out.println("All students in " + event.id + " get out");
			}
		});
		classRoom.addDoorCloseListener(new DoorListener() {
			@Override
			public void doorEvent(DoorEvent event) {
				System.out.println("Tell " + threeGoodStudent + " don't come to " + event.id);
			}
		});

		classRoom.openDoor("Guo Yike");
		classRoom.closeDoor("Lei Feng");

	}
}
