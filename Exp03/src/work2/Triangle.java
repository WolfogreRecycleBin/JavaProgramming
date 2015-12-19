package work2;

public class Triangle {
	
	double sides[] = new double[3];
	
	public Triangle(double side1, double side2, double side3){
		setSides(side1, side2, side3);
	}
	
	public void setSides(double side1, double side2, double side3){
		sides[0] = side1;
		sides[1] = side2;
		sides[2] = side3;
	}
	
	public double getPerimeter(){
		return sides[0] + sides[1] + sides[2];
	}
	
	public boolean isAvailable()
	{
		return (sides[0] < sides[1] + sides[2] 
				&& sides[1] < sides[0] + sides[2] 
				&& sides[2] < sides[0] + sides[1]);
	}
}
