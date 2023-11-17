import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14aug","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT city, count(id) AS total FROM student group by city");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("City: " + rs.getString("city"));
				System.out.println("Total Count : " + rs.getInt("total"));
				System.out.println("---------------------------");
			}
			
			con.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
