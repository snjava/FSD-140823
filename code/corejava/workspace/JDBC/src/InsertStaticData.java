import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStaticData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd14aug","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO student VALUES(5, 'Test1', '9980909876', 'Delhi', 22, 'M')");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Rows Inserted : " + count);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
