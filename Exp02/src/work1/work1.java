package work1;

import java.util.Scanner;

public class work1 {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		System.out.println("������3��1-100������:");
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
				System.out.println("�����ʽ����");
				scanner.nextLine();
				continue;
			}
			if(input > 100 || input < 1)
			{
				System.out.println("���뷶Χ����");
				continue;
			}
			++rightInputCount;
			sum += input;
			System.out.println("�Ѿ���ȷ����" + rightInputCount + "����");
		}
		System.out.println("�������,������֮��Ϊ" + sum);
	}

}
