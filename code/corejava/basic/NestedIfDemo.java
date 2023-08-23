public class NestedIfDemo {
	public static void main(String args[]) {
		double percent = 33;
		if(percent>=40 && percent<=100) {
			System.out.println("Congrats..!!");
			if(percent>=75 && percent<=100) {
				System.out.println("You got Distinction"); //75-100 
			}
			else if(percent>=60 && percent<75) {
				System.out.println("You got First Class"); //60-75
			}
			else if(percent>=50 && percent<60) {
				System.out.println("You got Second Class");//50-60
			}
			else {
				System.out.println("You got Pass Class");//above 40
			}
		} else if(percent>=0 && percent<40) {
			System.out.println("Sorry You ae fail..!!");
		} else {
			System.out.println("Invalid Percentage.....");
		}
	}
}
