public class ClassMethodObject {
	public static void main(String args[]) {
		System.out.println("Start of Main");

		// Reference Variable
		Calculator cal;
		// Object creation
		cal = new Calculator();

		Calculator cal1 = new Calculator();
		
		cal.add(); // access the method of class
		cal.sub(12,3);
		int ans1 = cal.mul();
		System.out.println("Mul : " + ans1);
		cal.div(10,3);
		System.out.println(cal.a); // access the variable of class

	}
}

class Calculator {
	int a = 10;
	int b = 20;
	public void add() {
		int ans = a + b;
		System.out.println("Add : " + ans);
	}
	public void sub(int a, int b) {
		int ans = a - b;
		System.out.println("Sub : " + ans);
	}
	public int mul() {
		int ans = a * b;
		return ans;
	}
	public double div(int a, double b) {
		double ans = a / b;
		System.out.println("Div : " + ans);
		return ans;	
	}
}









