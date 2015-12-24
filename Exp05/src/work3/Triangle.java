package work3;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class Triangle extends Geometry {
	double side1;
	double side2;
	double side3;

	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	double getArea() {
		double x = (side1 + side2 + side3) / 2;
		return Math.sqrt(x * (x-side1) * (x - side2) * (x - side3));
	}
}
