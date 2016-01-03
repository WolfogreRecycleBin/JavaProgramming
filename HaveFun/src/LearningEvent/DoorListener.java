package LearningEvent;

import java.util.EventListener;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/03/2016.
 */
public interface DoorListener extends EventListener {
	public void doorEvent(DoorEvent event);
}
