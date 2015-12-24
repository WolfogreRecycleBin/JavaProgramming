package work3;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class Pillar {
	Geometry undersurface;
	double height;

	public Pillar(Geometry undersurface, double height){
		this.undersurface = undersurface;
		this.height = height;
	}

	public double getVolume(){
		return undersurface.getArea() * height;
	}
}
