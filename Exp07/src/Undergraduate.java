/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/07/2016.
 */
public class Undergraduate extends Student  implements DegreeManageable{

	double aver;

	@Override
	public boolean getPass() {
		try {
			return status = (computeAverage() > 60);
		} catch (UndergraduateException e) {
			return false;
		}
	}

		@Override
	public double computeAverage() throws UndergraduateException {
		double sum = 0;
		for(double d : score){
			sum += d;
			if(d > 100 || d < 0)
				throw new UndergraduateException(name + "\'s one of score is " + d);
		}
		return aver = (sum / score.length);
	}

	@Override
	public String getDegree() {
		if(getPass())
			return Constants.ISSUE_UNDERGRADUATE_DEGREE;
		return Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
	}

	@Override
	public void printInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Gender: " + getGender());
		System.out.println("BirthDay: " + getBirthDay().getYear() + "-" + getBirthDay().getMonth() + "-" + getBirthDay().getDate());
		System.out.println("School: " + getSchool());
		System.out.println("StuId: " + getStuId());
		System.out.println("Category: " + getCategory());
	}
}
