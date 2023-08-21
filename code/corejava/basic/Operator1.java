public class Operator1 {
	public static void main(String args[]) {
		int a = 10;
		int b = 3;
		int ans = a + b;
		System.out.println(ans);	//13
		System.out.println(a - b);	//7
		System.out.println(a * b);	//30
		System.out.println(a / b);	//3
		System.out.println(a % b);	//1
		System.out.println("===============");
		int x = 20;
		int y = 6;
		x+=y;	//x = x + y
		System.out.println(x); 	// 26
		x-=y; 
		System.out.println(x); 	// 20
		y*=x;
		System.out.println(x);	// 20
		System.out.println(y);	// 120
		x/=y; // x = 20 / 120;
		System.out.println(x);	// 0
		System.out.println(y);	// 120
	}
}