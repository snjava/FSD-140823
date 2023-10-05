public class OverridingDemo {
	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.homeInterestRate();
		
		Axis axis = new Axis();
		axis.homeInterestRate();
	}
}
class Bank {
	final void homeInterestRate() {
		System.out.println("Housing Interate Rate : 11.05%");
	}
}
// ICICI IS-A Bank
class ICICI extends Bank {
	void homeInterestRate() {
		System.out.println("ICICI Housing Interate Rate : 11.20%");
	}
}

class Axis extends Bank {
	public void homeInterestRate() {
		System.out.println("Axis Housing Interate Rate : 11.10%");
	}
}