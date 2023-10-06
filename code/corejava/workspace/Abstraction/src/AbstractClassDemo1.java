
public class AbstractClassDemo1 {
	public static void main(String[] args) {
		AudiA8EV audicar = new AudiA8EV();
		Scorpio sc = new Scorpio();
		carDekhoDotCom(sc);
	}
	public static void carDekhoDotCom(Car car) {
		car.company();
		car.fuel();
		car.feature();
		car.noOfWheels();
	}
}
abstract class Car {
	public Car() {
		System.out.println("Car Class Constructor");
	}
	public void noOfWheels() {
		System.out.println("Car has a 4 wheels.");
	}
	abstract public void fuel();
	public abstract void company();
	public abstract void feature();
}

class AudiA8EV extends Car {
	public void fuel() {
		System.out.println("Fuel Type : Electric Vehicle");
	}
	public void company() {
		System.out.println("Company : Audi");
	}
	public void feature() {
		System.out.println("It is a Electric car of brand Audi.");
	}
}

abstract class Mahindra extends Car {
	public void company() {
		System.out.println("Company : Mahindra");
	}
}

class Scorpio extends Mahindra {
	public void fuel() {
		System.out.println("Fuel Type : Diesel Vehicle");
	}
	public void feature() {
		System.out.println("It is a Diesel car of brand Mahindra.");
	}
}



















