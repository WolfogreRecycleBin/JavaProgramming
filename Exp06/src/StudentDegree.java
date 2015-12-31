/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/31/2015.
 */
public class StudentDegree {
	public void printStudentInfo(Student student){
		//姓名、性别、出生日期、学校、学号、学生类别、平均成绩、平均分
		System.out.println("Name: " + student.getName());
		System.out.println("Gender: " + student.getGender());
		System.out.println("BirthDay: " + student.getBirthDay().getYear() + "-" + student.getBirthDay().getMonth() + "-" + student.getBirthDay().getDate());
		System.out.println("School: " + student.getSchool());
		System.out.println("StuId: " + student.getStuId());
		System.out.println("Category: " + student.getCategory());
		System.out.println("Average: " + student.computeAverage());
	}
	public void issueDegree(Student student){
		if(student instanceof Undergraduate){
			if(student.getDegree().equals(Constants.UNDERGRADUATE))
				System.out.println(Constants.ISSUE_UNDERGRADUATE_DEGREE);
			else
				System.out.println(Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE);
			return;
		}
		if(student instanceof Master){
			if(student.getDegree().equals(Constants.MASTER))
				System.out.println(Constants.ISSUE_MASTER_DEGREE);
			else
				System.out.println(Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE);
			return;
		}
		System.out.println("Unknown");
	}
}
