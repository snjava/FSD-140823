import java.util.Scanner;
public class ScannerDemo {
	public static void main(String arr[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = scan.next();
		System.out.println("Enter 1st Number : ");
		int n1 = scan.nextInt();
		System.out.println("Enter 2nd Number : ");
		int n2 = scan.nextInt();

		System.out.println("Name : " + name);
		System.out.println("Add : " + (n1 + n2));

		scan.close();
	}
}