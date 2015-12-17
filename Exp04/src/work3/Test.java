package work3;

import java.util.*;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入第一个点的横坐标和纵坐标:");
		Point p1 = new Point(scanner.nextDouble(), scanner.nextDouble());
		System.out.print("请输入第二个点的横坐标和纵坐标:");
		Point p2 = new Point(scanner.nextDouble(), scanner.nextDouble());
		System.out.println("线长:" + (new Line(p1,p2).length()));
	}

}
