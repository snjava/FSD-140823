public class IfDemo {
	public static void main(String args[]) {
		int percent = 200;
		if(percent>=40 && percent<=100)
		{
			System.out.println("Congrats, You are Pass");
		}
		else if(percent>=0 && percent<40)
		{
			System.out.println("Sorry, You are Fail");
		}
		else
		{
			System.out.println("Invalid Percent...");
		}
	}
}