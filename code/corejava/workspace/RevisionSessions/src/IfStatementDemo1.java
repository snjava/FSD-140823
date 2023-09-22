
public class IfStatementDemo1 {

	public static void main(String[] args) {
		int age = 123;
		
		if(age>=0 && age<=120) {
			System.out.println("Valid Age value..."); // Print if age is between 0 to 120 
		}
		else {
			System.out.println("Invalid Age value..."); // Print if age is not between 0 to 120 
		}
	}
}
