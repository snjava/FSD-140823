public interface Jdk2Interface {
	public static void m1() {
		System.out.println("Static method from Interface");
	}
	public static void main(String[] args) {
		System.out.println("Main Method from Interface");
		m1();
	}
	
	public default void m2() {
		System.out.println("Default Method from Interface");
	}
}

@FunctionalInterface
interface FunctionaInter {
	public void m1();
	public default void m2() {
		
	}
}


interface Test1 {
	default void m1() {
		System.out.println("m1() from Test1");
	}
}
interface Test2 {
	default void m1() {
		System.out.println("m2() from Test2");
	}
}
class Demo1 implements Test1, Test2 {
	public void m1() {
		System.out.println("Implemented Default Method");
	}
}
















