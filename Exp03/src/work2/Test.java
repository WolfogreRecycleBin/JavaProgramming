package work2;
import java.util.Scanner;

public class Test {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����������ε�������:");
		Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		if(triangle.isAvailable())
			System.out.println("���Թ���������");
		else
			System.out.println("�����Թ���������");
		
		System.out.print("������Բ�İ뾶:");
		Circle circle = new Circle(scanner.nextDouble());
		System.out.println("Բ�����:" + circle.getArea());
		
		System.out.print("�Դ�Բ��ΪԲ׶�ĵ�,������Բ׶�ĸ�:");
		Cone cone = new Cone(circle, scanner.nextDouble());
		System.out.println("Բ׶�����:" + cone.getVolume());
	}
}
