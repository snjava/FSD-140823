public class ConstrcutorDemo1 {
	public static void main(String[] args) {
		Employee e1 = new Employee(33, "Xyz", "76575675454");
		Employee e2 = new Employee(22, "Abc", "987988998", 23423.32);
		Employee e3 = new Employee(e2);
		e1.print();
		e2.print();
		e3.print();
	}
}

class Employee {
	int id;
	String name;
	String contact;
	double salary;
	
	public Employee(int i, String nm, String ct, double s) { // 4-param constructor
		id = i;
		name = nm;
		contact = ct;
		salary = s;
	}
	
	// Copy constructor
	public Employee(Employee emp) {
		id = emp.id;
		name = emp.name;
		contact = emp.contact;
		salary = emp.salary;
	}
	
	public Employee(int i, String nm, String ct) { // 3-param constructor
		id = i;
		name = nm;
		contact = ct;
	}
	
	public void print() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Contact : " + contact);
		System.out.println("Salary : " +  salary);
		System.out.println("=========================");
	}
}
