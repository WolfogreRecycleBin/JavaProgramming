import java.util.Date;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/31/2015.
 */
public class StudentApplication {
	public static void main(String args[]){

		Undergraduate undergraduate = new Undergraduate();
		undergraduate.setName("Wang Xiaoer");
		undergraduate.setGender('M');
		undergraduate.setBirthDay(new Date(1992, 6, 1));
		undergraduate.setSchool("Shanghai University");
		undergraduate.setStuId("11128981");
		undergraduate.setCategory(Constants.UNDERGRADUATE);
		undergraduate.setScore(new double[] {89.5, 82, 87, 73});
		undergraduate.setStatus(false);

		Master master = new Master();
		master.setName("Li Yan");
		master.setGender('F');
		master.setBirthDay(new Date(1985, 6, 12));
		master.setSchool("Shanghai University");
		master.setStuId("10306");
		master.setCategory(Constants.MASTER);
		master.setScore(new double[] {70, 52.5, 95, 88, 89, 91});
		master.setThesisLevel('B');
		master.setStatus(false);

		StudentDegree studentDegree = new StudentDegree();
		Student student;
		student = undergraduate;
		studentDegree.printStudentInfo(student);
		studentDegree.issueDegree(student);
		student = master;
		studentDegree.printStudentInfo(student);
		studentDegree.issueDegree(student);
	}
}
