/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/07/2016.
 */
public class UndergraduateException extends Exception {

	String message;

	public UndergraduateException(String message){
		super(message);
		this.message = message;
	}

	public String warnMess(){
		return message;
	}
}
