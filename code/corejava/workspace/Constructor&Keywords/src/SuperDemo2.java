
public class SuperDemo2 {
	public static void main(String[] args) {
		Y obj1 = new Y(23);
	}
}

class X {
	public X() {
		System.out.println("X class No-Param");
	}
	public X(int a) {
		System.out.println("X class 1 int Param");
	}
}

class Y extends X {
	public Y() {
		System.out.println("Y class No-Param");
	}
	public Y(int a) {
		super(45); //Constructor call must be the first statement in a constructor
		System.out.println("Y class 1 int Param");
	}
}
