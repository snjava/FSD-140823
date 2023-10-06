public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Fortuner f = new Fortuner();
		f.description();
		AudiA8 a = new AudiA8();
		getCarDetails(a);
	}
	public static void getCarDetails(Car car) { // Car car = f
		car.description();
	}
}
class Car {
	public void description() {
		System.out.println("Car has a Four Wheels.");
	}
}
class Fortuner extends Car {
	public void description() {
		System.out.println("Fortuner is a Toyota's Car.");
	}
}
class AudiA8 extends Car {
	public void description() {
		System.out.println("A8 is an Audi's Car.");
	}
}


