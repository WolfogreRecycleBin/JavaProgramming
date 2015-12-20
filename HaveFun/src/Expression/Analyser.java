package Expression;

public class Analyser {
	public static double analyse(String expression) throws Exception{
		expression = expression.replace(" ", "");
		expression = expression.replace('＋', operators[0]);
		expression = expression.replace('－', operators[1]);
		expression = expression.replace('×', operators[2]);
		expression = expression.replace('x', operators[2]);
		expression = expression.replace('X', operators[2]);
		expression = expression.replace('÷', operators[3]);
		for(char ch : expression.toCharArray()){
			if("1234567890.".indexOf(ch) == -1 && !isOperator(ch))
				throw new Exception("输入有误");
		}
		try{
			return analyseHelp(expression);
		}
		catch(Exception ex){
			throw new Exception("输入有误");
		}
	}
	
	private static char[] operators = {'+','-','*','/'};
	
	private static double analyseHelp(String expression)
	{
		int index = findLastOperator(expression);
		if(index == -1)
			return Double.parseDouble(expression);
		if(expression.charAt(index) == operators[0])
			return analyseHelp(expression.substring(0, index)) + analyseHelp(expression.substring(index + 1, expression.length()));
		if(expression.charAt(index) == operators[1])
			return analyseHelp(expression.substring(0, index )) - analyseHelp(expression.substring(index + 1, expression.length()));
		if(expression.charAt(index) == operators[2])
			return analyseHelp(expression.substring(0, index)) * analyseHelp(expression.substring(index + 1, expression.length()));
		return analyseHelp(expression.substring(0, index)) / analyseHelp(expression.substring(index + 1, expression.length()));
	}
	
	private static int findLastOperator(String expression){
		for(int  i = expression.length() - 1; i >= 0; --i){
			if(isAddOrSub(expression.charAt(i)) && i != 0 && !isOperator(expression.charAt(i - 1)))
				return i;
		}
		for(int  i = expression.length() - 1; i >= 0; --i){
			if(isOperator(expression.charAt(i)) && i != 0 && !isOperator(expression.charAt(i - 1)))
				return i;
		}
		return -1;
	}
	
	private static boolean isAddOrSub(char ch){
		/*What IntelliJ IDEA told me, amazing！
		'if' statement can be simplified less... (Ctrl+F1)
		Reports if statements which can be simplified to single assignment or return statements.
		For example:
        if (foo()) {
		return true;
		} else {
		 return false;
		}
		can be simplified to
        return foo();
		*/
		return ch == operators[0] || ch == operators[1];
	}
	
	private static boolean isOperator(char ch){
		/*What IntelliJ IDEA told me:'if' statement can be replaced with 'return ch == operators[2] || ch == operators[3] || isAddOrSub(ch);'*/
		/*WTF!*/
		return ch == operators[2] || ch == operators[3] || isAddOrSub(ch);
	}
}
