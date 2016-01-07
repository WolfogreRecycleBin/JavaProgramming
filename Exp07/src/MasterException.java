/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/07/2016.
 */
public class MasterException extends Exception {

	String message;

	public MasterException(String message){
		super(message);
		this.message = message;
	}

	public String warnMess(){
		return message;
	}
}
