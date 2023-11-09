import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDynamicData {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter contact : ");
		String contact = scan.next();
		System.out.println("Enter City : ");
		String city = scan.next();
		scan.close();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14aug","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE student SET contact=?, city=? WHERE id=?"); // parameterized query
				stmt.setString(1, contact);
				stmt.setString(2, city);
				stmt.setInt(3, id);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Rows Inserted : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
