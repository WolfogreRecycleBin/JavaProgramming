/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/07/2016.
 */
public class Master extends Student implements DegreeManageable{

	double aver;
	char thesisLevel;

	public void setThesisLevel(char thesisLevel) {
		this.thesisLevel = thesisLevel;
	}

	@Override
	public boolean getPass() {
		try{
			return status = (computeAverage() > 80 && thesisLevel <= 'C');
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public double computeAverage() throws MasterException{
		if(thesisLevel > 'F' || thesisLevel < 'A')
			throw new MasterException(name + "\' thesis level is " + thesisLevel);
		double quotients = 1;
		for(double d : score){
			quotients *= d;
			if(d > 100 || d < 0)
				throw new MasterException(name + "\'s one of score is " + d);
		}
		return aver = Math.pow(quotients,1.0 / score.length);
	}

	@Override
	public String getDegree() {
		if(status)
			return Constants.ISSUE_MASTER_DEGREE;
		return Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
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
