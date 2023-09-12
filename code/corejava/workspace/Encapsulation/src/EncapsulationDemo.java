/**
 * 
 * Advantage of Encapsulation
 * 	1. It is one of the way to achieve the loose coupling
 *  2. You can control the data, that is you can control who can access what.
 *  3. Can achieve data hiding
 *  4. Can apply validation and enrichment on the data. 
 *
 */


public class EncapsulationDemo {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(123);
		p1.setName("Abcd");
		p1.setPrice(3453.32);
		print(p1);
	}
	public static void print(Product p1) {
		System.out.println("Id : " + p1.getId());
		System.out.println("Name : " + p1.getName());
		System.out.println("Price : " + p1.getPrice());
	}
}

// Encapsulated class, DTO (Data Transfer Object), Model, Entity, Bean 
class Product {
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

