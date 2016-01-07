/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/07/2016.
 */
public class StudentDegree {
	public void issueDegree(DegreeManageable dm){
		dm.printInfo();
		try{
			System.out.println("Average: " + dm.computeAverage());
		}catch (MasterException ex){
			System.out.println("Master course grade exception: " + ex.warnMess());
			return;
		}catch (UndergraduateException ex){
			System.out.println("Undergraduate thesis level exception: " + ex.warnMess());
			return;
		} catch (Exception ex) {
			ex.printStackTrace();
			return;
		}
		System.out.println("Degree " + dm.getDegree());
	}
}
