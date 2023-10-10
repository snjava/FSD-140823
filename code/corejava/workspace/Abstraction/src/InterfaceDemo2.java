public class InterfaceDemo2 {
	public static void main(String[] args) {
		System.out.println(I3.a);
		System.out.println(I3.b);
		System.out.println(I3.c);
	}
}
interface I1 {
	int a= 10;
	public void m1();
}
interface I2 {
	int b= 20;
	public void m2();
}
// One Interface can extends more than one interface which is example of multiple inheritance
interface I3 extends I1, I2 {
	int c= 30;
	public void m3();
}
// One Class can implements more than one interface
class Test implements I1, I2 {
	public void m1() {
		
	}
	public void m2() {
		
	}
}
// One class extends another class and implements one or more interface.
class Demo extends Test implements I3 {
	public void m3() {
		
	}
}

//==============Ambiguity issue resolve============
interface Inter1 {
	int a = 10;
	public void m1();
}
interface Inter2 {
	int a = 20;
	public void m1();
}

class Example implements Inter1, Inter2 {
	public void m1() {
		System.out.println(Inter1.a);
		System.out.println(Inter2.a);
	}
}

































