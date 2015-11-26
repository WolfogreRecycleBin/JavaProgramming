import java.util.*;

public class Hello {
	public static void main(String[] args){
		System.out.println("Hello World!");
		System.out.println("This is my first Java program.");
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.print("input x:");
			int number = scanner.nextInt();
			if(number == -1)
				break;
			TestClass testClass = new TestClass();
			System.out.println(testClass.Fib(number));
			
		}
		scanner.close();
	}
}
