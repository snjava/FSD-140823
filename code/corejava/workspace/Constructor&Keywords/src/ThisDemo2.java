public class ThisDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student(111, "A", "Pune");
		Student s2 = new Student(222, "B");
		s1.print();
		s2.print();
	}
}
class Student {
	private int id;
	private String name;
	private String address;
	public Student(int id, String name, String address) {
		this(id, name); // accessing constructor of same class.
		this.address = address;
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
	}
}