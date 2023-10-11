import java.util.Scanner;

public class ExceptionIntro {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st Number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Number : ");
		int num2 = scan.nextInt();
		
		System.out.println("Add : " + (num1 + num2));
		System.out.println("Sub : " + (num1 - num2));
		try {
			System.out.println("Div : " + (num1 / num2));
			System.out.println("Mod : " + (num1 % num2));
		} 
		catch(ArithmeticException ex) {
			System.out.println("Cannot Divide by Zero....");
			/*System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
			ex.printStackTrace();*/
		}
		System.out.println("Mul : " + (num1 * num2));
	}
}
