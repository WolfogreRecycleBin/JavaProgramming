package Expression;
import java.util.Scanner;

public class TestAnalyser {
	public static void main(String args[]){
		System.out.println("��������ѧ���ʽ:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true){
			String input = scanner.nextLine();
			if(input.isEmpty())
				break;
			try{
				System.out.println("ֵΪ:" + Analyser.analy(input));
			}catch(Exception ex){
				System.out.println("��������!");
			}
		}
	}
}
