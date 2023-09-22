/**
 * 
 * age is between 0 to 15 then print Child Age
 * age is between 15 to 18 then print Teen Age
 * age is between 18 to 60 then print Adult Age
 * age is between 60 to 120 then print Old Age
 * For any other age value print invalid age
 */
public class IfStatementDemo2 {

	public static void main(String[] args) {
		int age = 15;
		if(age>=0 && age<=120) {
			if(age>0 && age<=15) {
				System.out.println("Child Age");
			}
			else if(age>15 && age<18) {
				System.out.println("Teen Age");
			}
			else if(age>=18 && age<60) {
				System.out.println("Adult Age");
			}
			else if(age>=60 && age<=120) {
				System.out.println("Old Age");
			}
		}
		else {
			System.out.println("Invalid Age...");
		}
	}

}
