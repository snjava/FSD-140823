
public class OperatorsExample_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.println("=====Arithmetic  Operator=========");
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a-b);
		System.out.println(a%b);
		
		System.out.println("=====Assignment Operator=========");
		a+=b; // a = a + b
		System.out.println(a); // 13
		b-=a; // b = b - a; 3 - 13
		System.out.println(b); // -10
		a*=b; 
		System.out.println(a); // -130
		a/=b;
		System.out.println(a); // 13
		
		System.out.println("=====Increment/decrement Operator=========");
		int x = 10;
		x++; // Post increment  (x = x + 1)
		++x; // pre increment   (x = x + 1)
		System.out.println(x);	// 12
		x--; // Post decrement  (x = x - 1)
		--x; // pre decrement   (x = x - 1)
		System.out.println(x);	// 10
		
		int y = 5;
		//int z = y++; // Post increment= Assign the value, Operation and update the value
		int z = ++y; // Pre increment = Operation, Update values and then Assign the value.
		System.out.println(z); // 6
		System.out.println(y); // 6
		
		int p = 23;
		int q = p--; // q=23, p=22     // Post decrement = Assign the value, Operation and update the value
		int s = --p; // s=21, p=21     // Pre decrement = Operation, Update values and then Assign the value.
		System.out.println(p); // 21  23/23
		System.out.println(q); // 23  23/22
		System.out.println(s); // 21  22/22
	}
}





