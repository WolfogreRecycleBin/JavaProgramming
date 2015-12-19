package work3;

public class Point {
	double x;
	double y;
	
	public Point(){
		this(0, 0);
	}
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(double y){
		return y;
	}
}
