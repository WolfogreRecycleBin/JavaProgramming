
public class TestClass {
	public int Fib(int x)
	{
		if(x <= 0)
			return 0;
		if(x == 1 || x == 2) 
			return 1;
		return Fib(x - 1) + Fib(x - 2);
	}
}
