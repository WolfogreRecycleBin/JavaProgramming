package work2;
import java.util.Scanner;

public class Test {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入三角形的三条边:");
		Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		if(triangle.isAvailable())
			System.out.println("可以构成三角形");
		else
			System.out.println("不可以构成三角形");
		
		System.out.print("请输入圆的半径:");
		Circle circle = new Circle(scanner.nextDouble());
		System.out.println("圆的面积:" + circle.getArea());
		
		System.out.print("以此圆作为圆锥的底,请输入圆锥的高:");
		Cone cone = new Cone(circle, scanner.nextDouble());
		System.out.println("圆锥的体积:" + cone.getVolume());
	}
}
