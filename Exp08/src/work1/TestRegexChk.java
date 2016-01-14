package work1;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/14/2016.
 */
public class TestRegexChk {

	static RegexChk regexChk;

	public static void main(String args[]){
		regexChk = new RegexChk();

		testCheckInteger("111111", "-1234", "--1234", "123.1", "0x12", "0");
		testCheckPhoneNumber("18701979107","1234567890", "1234567890");
		testCheckEmail("123@11.com","12@11.com", "123@11.com.cn", "123@11.con.");
		testPostalCode("123456", "12345", "12345a");
		testIdCardNumber("342623199412080000", "111111111111111", "11111111111111111X", "1234567890","342623199412080000X");

	}

	static void testCheckInteger(String ... strings){
		System.out.println("Check Integer:");
		for(String str : strings){
			System.out.println(str + " : " +  regexChk.isInteger(str));
		}
		System.out.println();
	}

	static void testCheckPhoneNumber(String ... strings){
		System.out.println("Check Phone Number:");
		for(String str : strings){
			System.out.println(str + " : " +  regexChk.isPhoneNumber(str));
		}
		System.out.println();
	}

	static void testCheckEmail(String ... strings){
		System.out.println("Check Email:");
		for(String str : strings){
			System.out.println(str + " : " +  regexChk.isEmail(str));
		}
		System.out.println();
	}

	static void testPostalCode(String ... strings){
		System.out.println("Check Postal Code:");
		for(String str : strings){
			System.out.println(str + " : " +  regexChk.isPostalCode(str));
		}
		System.out.println();
	}

	static void testIdCardNumber(String ... strings){
		System.out.println("Check ID Card Number:");
		for(String str : strings){
			System.out.println(str + " : " +  regexChk.isIdCardNumber(str));
		}
		System.out.println();
	}
}
