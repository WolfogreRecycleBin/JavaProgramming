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
		undergraduate.setScore(89.5, 82, 87, 73);
		undergraduate.setStatus(false);

		Master master = new Master();
		master.setName("Li Yan");
		master.setGender('F');
		master.setBirthDay(new Date(1985, 6, 12));
		master.setSchool("Shanghai University");
		master.setStuId("10306");
		master.setCategory(Constants.MASTER);
		master.setScore(70, 52.5, 95, 88, 89, 91);
		master.setThesisLevel('B');
		master.setStatus(false);

		Master cheater = new Master();
		cheater.setName("Cheater");
		cheater.setGender('F');
		cheater.setBirthDay(new Date(1985, 6, 12));
		cheater.setSchool("Shanghai University");
		cheater.setStuId("11111");
		cheater.setCategory(Constants.MASTER);
		cheater.setScore(200, 52.5, 95, 88, 89, 91);
		cheater.setThesisLevel('A');
		cheater.setStatus(false);

		StudentDegree studentDegree = new StudentDegree();
		DegreeManageable degreeManageable;

		degreeManageable = undergraduate;
		studentDegree.issueDegree(degreeManageable);
		System.out.println();

		degreeManageable = master;
		studentDegree.issueDegree(degreeManageable);
		System.out.println();

		degreeManageable = cheater;
		studentDegree.issueDegree(degreeManageable);
		System.out.println();
	}
}
