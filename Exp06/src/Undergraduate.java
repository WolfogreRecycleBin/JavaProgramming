/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/31/2015.
 */
public class Undergraduate extends Student {

	double aver;

	@Override
	public boolean getPass() {
		return status = (computeAverage() > 60);
	}

	@Override
	public double computeAverage() {
		double sum = 0;
		for(double d : score)
			sum += d;
		return aver = (sum / score.length);
	}

	@Override
	public String getDegree() {
		if(getPass())
			return Constants.UNDERGRADUATE;
		return "Void";
	}
}
