import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEnhancementJDK7 {
	public static void main(String[] args) {
		String message = "Hello Java Program.";
		
		try(Scanner scan = new Scanner(System.in);) { // try with resource
			System.out.println("Enter Start Index : ");
			int startIndex = scan.nextInt();
			System.out.println("Enter End Index : ");
			int endindex = scan.nextInt();
			
			String result = message.substring(startIndex, endindex);
			System.out.println(result);
		} 
		catch(InputMismatchException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("Something Went Wrong.. Try after sometime.");
		}
		catch (Exception e) {
			System.out.println("Try after sometime.");
		}
		
	}
}
