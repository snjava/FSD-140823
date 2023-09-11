public class EncapsulationDemo {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(123);
		p1.setName("Abcd");
		p1.setPrice(3453.32);
		
		System.out.println("Id : " + p1.getId());
		System.out.println("Name : " + p1.getName());
		System.out.println("Price : " + p1.getPrice());
		
	}
}

class Product {
	private int id;
	private String name;
	private double price;
	
	public void setId(int i) {
		id = i;
	}
	public void setName(String nm) {
		name = nm;
	}
	public void setPrice(double p) {
		if(p<=100) {
			System.out.println("Invalid Price...");
			System.exit(0);
		} else {
			price = p;
		}
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}

