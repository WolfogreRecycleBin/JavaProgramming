package work2;

public class Circle {
	
	double radius;
	
	public Circle(double radius){
		setRadius(radius);
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
}
