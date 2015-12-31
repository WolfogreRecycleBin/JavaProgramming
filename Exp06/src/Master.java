/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/31/2015.
 */
public class Master extends Student {

	double aver;
	char thesisLevel;

	public void setThesisLevel(char thesisLevel) {
		this.thesisLevel = thesisLevel;
	}

	@Override
	public boolean getPass() {
		return status = (aver > 80 && thesisLevel <= 'C');
	}

	@Override
	public double computeAverage() {
		double quotients = 1;
		for(double d : score)
			quotients *= d;
		return aver = Math.pow(quotients,1.0 / score.length);
	}

	@Override
	public String getDegree() {
		if(status)
			return Constants.MASTER;
		return "Void";
	}
}
