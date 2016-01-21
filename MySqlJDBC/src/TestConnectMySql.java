import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 01/21/2016.
 */
public class TestConnectMySql {
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://120.27.99.15:3306/github_net","wolf",new Scanner(System.in).nextLine());
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
