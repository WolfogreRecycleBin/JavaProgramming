package work2;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class SubVariable extends ParentVariable {
	static String staticString = "I am belong to SubVariable, I am static variable";
	String memberString = "I am belong to SubVariable, I am member variable";

	public String getParentStaticString(){
		return ParentVariable.staticString;
	}

	public String getParentMemberString(){
		return super.memberString;
	}
}
