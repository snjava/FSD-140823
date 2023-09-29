public class ThisDemo1 {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.print();
	}
}

class Test {
	int a = 10;
	public void print() {
		int a = 20;
		System.out.println(a);
		System.out.println(this.a); // accessing same class variable 
		this.m(); // accessing same class method 
	}
	public void m() {
		System.out.println("m() from test class");
	}
}
