import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		int array[] = {14,4,0,54,34,8,32};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Index : ");
		// If you are providing a multiple catch block for a single try then,
		// you cannot handle the parent exception before child
		try {	
			int index = scan.nextInt();
			int value = array[index];
			int square = value * value;
			System.out.println("Square : " + square);
			//System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index.. Please try again...");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input.. Please try with valid value....");
		}
		catch(Exception e) {
			System.out.println("Something Went wrong");
		} 
		finally {
			scan.close();
			System.out.println("Resource Closed....");
		}
	}
}
