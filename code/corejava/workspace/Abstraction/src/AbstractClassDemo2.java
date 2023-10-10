public class AbstractClassDemo2 {
	public static void main(String[] args) {
		AbstractDemo.m2();
	}
}

abstract class AbstractDemo {
	public abstract void m1();
	public final static void m2() {
		System.out.println("Static Final Method from abstract class");
	}
}
