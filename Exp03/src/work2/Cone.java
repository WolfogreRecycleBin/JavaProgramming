package work2;

public class Cone {

	Circle floorage;
	double height;
	
	public Cone(Circle floorage, double height){
		this.floorage = floorage;
		this.height = height;
	}
	
	public double getVolume(){
		return floorage.getArea() * height / 3;
	}
}
