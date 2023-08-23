/*
	WAP to Print the Day with char
	M - Monday
	T - Tuesday, Thursday
	W - Wednesday
	F - Friday
	S - Saturday, Sunday
	Other char - Invalid Day..
*/
public class SwitchDemo {
	public static void main(String args[]) {
		char day = 'T'; 
		switch(day) { 
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
				System.out.println("Friday");
				break;
			case 'S':
				System.out.println("Saturday or Sunday");
				break;
			default:
				System.out.println("Invalid Day....");
		}
	}
}







