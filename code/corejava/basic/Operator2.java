public class Operator2 {
	public static void main(String args[]) {
		int a = 10;
		a++; // post incremenent // a = a + 1 
		++a; // pre incremenent  // a = a + 1
		System.out.println(a);

		int b =  12;
		int x = b++;	// x= 12, b= 13
		int y = ++b;	// b= 14, y= 14
		System.out.println(b);	// 14
		System.out.println(x);	// 12
		System.out.println(y);	// 14
	}
}