
public class OperatorsExample_2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 10;
		System.out.println("=======Relational Operator=======");
		System.out.println(a>b); // true
		System.out.println(a>=c);// true
		System.out.println(a<b); // false/false
		System.out.println(a<=c);// false/true
		System.out.println(b<a); // true/true
		System.out.println(a == c); // true
		System.out.println(a == b); // false
		System.out.println(a != c); // false 
		System.out.println(a != b); // true
		System.out.println("=======Logical Operator=======");
		System.out.println(a & b); //0
		System.out.println(a | b); //15
		
		System.out.println(a>0 & a<50); // true
		System.out.println(a>0 | a<50); // true
		System.out.println(!(a>0)); // false
		
		System.out.println("=======Short Circuit Logical Operator=======");
		System.out.println(a>0 && a<50); // true
		System.out.println(a>0 || a<50); // true
		
		System.out.println("=======Ternary Operator=======");
		int age = 20;
		String status = (age>0 && age<=100) ? "Valid" : "Invalid";
		System.out.println(status);
	}
}







