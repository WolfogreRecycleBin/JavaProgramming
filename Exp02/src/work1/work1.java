package work1;

import java.io.IOException;
import java.util.Scanner;

public class work1 {
	public static void main(String args[])
	{
		System.out.println("������3��1-100������:");
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
			System.out.println("�Ѿ���ȷ����" + rightInputCount + "����");
		}
		System.out.println("�������!");
	}

}
