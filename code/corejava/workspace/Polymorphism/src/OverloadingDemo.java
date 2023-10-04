public class OverloadingDemo {
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(45, 20);
	}
}

class Calculation {
	public void add(int a, int b) {
		System.out.println("2 int addition : " + (a+b));
	}
}
