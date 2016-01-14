package work1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/14/2016.
 */
public class RegexChk {

	public boolean isInteger(String str){
		return march("^-?\\d*$", str);
	}

	public boolean isPhoneNumber(String str){
		return march("^\\d{11}$", str);
	}

	public boolean isEmail(String str){
		return march("^\\w{3,}@\\w+(.\\w+).?\\w+$", str);
	}

	public boolean isPostalCode(String str){
		return march("^\\d{6}$", str);
	}

	public boolean isIdCardNumber(String str){
		return march("^\\d{15}|\\d{18}|\\d{17}X$", str);
	}

	private boolean march(String regex, String string){
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		return matcher.matches();
	}
}
