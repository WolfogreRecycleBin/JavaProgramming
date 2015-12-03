package work1;

import java.io.IOException;
import java.util.Scanner;

public class work1 {
	public static void main(String args[])
	{
		System.out.println("请输入3个1-100的整数:");
		Scanner scanner = new Scanner(System.in);
		int rightInputCount = 0;
		int input;
		while(rightInputCount < 3)
		{
			try
			{
				input = scanner.nextInt();
			}
			catch(Exception ex)
			{
				System.out.println("输入格式有误！");
				scanner.nextLine();
				continue;
			}
			if(input > 100 || input < 1)
			{
				System.out.println("输入范围有误！");
				continue;
			}
			++rightInputCount;
			System.out.println("已经正确输入" + rightInputCount + "个数");
		}
		System.out.println("程序结束!");
	}

}
