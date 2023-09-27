public class HeapStackMemory {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.id = 23;
		p1.name="Laptop";
		p1.price=34534.234;
		p1.print();
	}
}

class Product {
	int id;
	String name;
	double price;
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
	}
}