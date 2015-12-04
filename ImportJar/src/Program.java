import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
public class Program {
	public static void main(String args[])
	{
		FelEngine fel= new FelEngineImpl();    
		Object result= fel.eval("12+7500");    
		System.out.println(result);  
	}
}
