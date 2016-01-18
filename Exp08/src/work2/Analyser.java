package work2;

public class Analyser {

	private static char[] operators = {'+','-','*','/'};

	public static double analyse(String expression) throws Exception{
		expression = expression.replace(" ", "");
		for(char ch : expression.toCharArray()){
			if("1234567890.".indexOf(ch) == -1 && !isOperator(ch))
				throw new Exception("Input Error!");
		}
		try{
			return analyseHelp(expression);
		}
		catch(Exception ex){
			throw new Exception("Input Error!");
		}
	}

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
		return ch == operators[0] || ch == operators[1];
	}
	
	private static boolean isOperator(char ch){
		return ch == operators[2] || ch == operators[3] || isAddOrSub(ch);
	}
}
