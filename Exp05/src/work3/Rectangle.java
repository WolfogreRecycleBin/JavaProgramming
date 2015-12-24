package work3;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class Rectangle extends Geometry {
	double side1;
	double side2;

	public Rectangle(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	double getArea() {
		return side1 * side2;
	}
}
