public class OverridingDemo2 {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eat();
		Cat c = new Cat();
		c.eat();
	}
}
class Animal {
	public void eat() {
		System.out.println("Eats Veg OR Non-Veg");
	}
}
class Tiger extends Animal {
	public void eat() {
		System.out.println("Eats Non-Veg");
	}
}
class Cat extends Animal {
}

