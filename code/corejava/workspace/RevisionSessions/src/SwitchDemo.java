
public class SwitchDemo {
	public static void main(String[] args) {
		char ch = 'f';
		switch(ch) {
			case 'M':
				System.out.println("Monday");
				break;
			case 'T':
				System.out.println("Tuesday or Thursday");
				break;
			case 'W':
				System.out.println("Wednesday");
				break;
			case 'F': 
			case 'f':
				System.out.println("Friday");
				break;
			case 'S':
				System.out.println("Saturday or Sunday");
				break;
			default:
				System.out.println("Invalid Day...");
				break;
		}
	}
}
