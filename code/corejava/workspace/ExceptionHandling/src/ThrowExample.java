import java.util.Scanner;

/*
 * Steps to raise exception manually
 * 		Identify/Create the exception scenario.
 * 		Identify and Create Object of Exception 
 * 		Throw the Object of exception using throw keyword
 */
public class ThrowExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Age..");
		int age = scan.nextInt();
		int currentYear = 2023;
		
		if(!(age>0 && age<=110)) {
			throw new RuntimeException("Invalid Age.. Cannot Process ahead...");
		}
		
		int birthYear = currentYear - age;
		System.out.println("Your Bith year is : " + birthYear);
		
		/*try {
			if(!(age>0 && age<=110)) {
				throw new RuntimeException("Invalid Age.. Cannot Process ahead...");
			}
			int birthYear = currentYear - age;
			System.out.println("Your Bith year is : " + birthYear);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}*/
		
	}
}
