public class OverloadingDemo {
	public static void main(int[] args) {
		System.out.println("main with int[]");
	}
	public static void main(char[] ch) {
		System.out.println("main with char[]");
	}
	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(34, 45.34f);
		//cal.add(54.67, 67.54);
		//cal.add(34, 45, 56);
		//cal.add("Abc", " Xyz");
		
		int arr[] = {345,56,75,8};
		main(arr);
	}
}
class Calculation {
	public static final void add(int a, int b) {
		System.out.println("2 int addition : " + (a+b));
	}
	public static final double add(double a, double b) {
		System.out.println("2 double addition : " + (a+b));
		return (a+b);
	}
	protected void add(String a, String b) {
		System.out.println("2 string addition : " + (a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("3 int addition : " + (a+b+c));
	}
	public void add(int a, float b) {
		System.out.println("1 int & 1 float addition : " + (a+b));
	}
	public void add(float a, int b) {
		System.out.println("1 float & 1 int addition : " + (a+b));
	}
}




