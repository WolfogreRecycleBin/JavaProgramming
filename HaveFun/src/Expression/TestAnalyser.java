package Expression;
import java.util.Scanner;

public class TestAnalyser {
	public static void main(String args[]){
		System.out.println("请输入数学表达式:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true){
			String input = scanner.nextLine();
			if(input.isEmpty())
				break;
			try{
				System.out.println("值为:" + Analyser.analy(input));
			}catch(Exception ex){
				System.out.println("输入有误!");
			}
		}
	}
}
