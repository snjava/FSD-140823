
public class ConstrcutorDemo2 {
	public static void main(String[] args) {
		C c = new C();
	}
}

class A {
	public A() {
		System.out.println("From A");
	}
}

class B extends A {
	public B() {
		System.out.println("From B");
	}
}

class C extends B {
	public C() {
		super();
		System.out.println("From C");
	}
}