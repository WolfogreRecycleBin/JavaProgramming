package work3;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class Circle extends Geometry {
	double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.PI * radius * radius;
	}
}
