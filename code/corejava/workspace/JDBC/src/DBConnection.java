import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14aug","root","root");
			System.out.println("Connection Success...");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
