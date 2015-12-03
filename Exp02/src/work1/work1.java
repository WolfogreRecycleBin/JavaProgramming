package work1;

import java.util.Scanner;

public class work1 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		System.out.println("请输入3个1-100的整数:");
		Scanner scanner = new Scanner(System.in);
		int rightInputCount = 0;
		int sum = 0;
		int input;
		while(rightInputCount < 3)
		{
			if(scanner.hasNextInt())
			{
				input = scanner.nextInt();
				scanner.nextLine();
			}
			else
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
			sum += input;
			System.out.println("已经正确输入" + rightInputCount + "个数");
		}
		System.out.println("程序结束,三个数之和为" + sum);
	}

}
