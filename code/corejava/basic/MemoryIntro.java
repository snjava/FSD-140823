public class MemoryIntro {
	public static void main(String ar[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.id = 123;
		e1.salary = 456456.45;
		e1.print();
	}
} 
class Employee {
	int id;
	double salary;
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
	}
}