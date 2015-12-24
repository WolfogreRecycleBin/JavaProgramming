package work3;

import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class Application {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please input the radius of the circle:");
		Circle circle = new Circle(scanner.nextDouble());
		System.out.println("The area of the circle is " + circle.getArea());
		System.out.print("Please input the height of the cylinder:");
		Pillar cylinder = new Pillar(circle, scanner.nextDouble());
		System.out.println("The volume of the cylinder is " + cylinder.getVolume());

		System.out.print("Please input the 2 sides of the rectangle:");
		Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
		System.out.println("The area of the rectangle is " + rectangle.getArea());
		System.out.print("Please input the height of the triangular prism:");
		Pillar triangularPrism = new Pillar(rectangle, scanner.nextDouble());
		System.out.println("The volume of the triangular prism is " + triangularPrism.getVolume());

		System.out.print("Please input the 3 sides of the triangle:");
		Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		System.out.println("The area of the triangle is " + triangle.getArea());
		System.out.print("Please input the height of the cuboid:");
		Pillar cuboid = new Pillar(triangle, scanner.nextDouble());
		System.out.println("The volume of the cuboid is " + cuboid.getVolume());
	}
}
