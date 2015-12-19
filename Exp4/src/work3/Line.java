package work3;

public class Line {
	Point p1;
	Point p2;
	
	public Line(){
		this(new Point(), new Point());
	}
	
	public Line(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public double length(){
		return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	}
}
