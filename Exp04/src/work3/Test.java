package work3;

import java.util.*;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������һ����ĺ������������:");
		Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
		System.out.print("������ڶ�����ĺ������������:");
		Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
		System.out.println("�߳�:" + (new Line(p1,p2).length()));
	}

}
