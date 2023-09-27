
public class SuperDemo1 {
	public static void main(String[] args) {
		C2 c = new C2();
		c.print();
	}
}


class C1  {
	public C1() {
		System.out.println("From C1");
	}
	int a = 10;
	public void m() {
		System.out.println("m() from class C1");
	}
}

class C2 extends C1 {
	public C2() {
		super(); // accessing constructor of super class 
		System.out.println("From C2");
	}
	int a = 20;
	public void m() {
		System.out.println("m() from class C2");
	}
	public void print() {
		System.out.println(super.a); // access variable of super class
		super.m(); // accessing method of super class
	}
}