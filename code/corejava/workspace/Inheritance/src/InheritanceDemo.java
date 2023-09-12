public class InheritanceDemo {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.id = 123;
		emp1.salary = 345345.43;
		emp1.name = "Abcd";
		emp1.age = 26;
		emp1.printPerson();
		emp1.printEmployee();
		System.out.println("=======================");
		SoftwareDeveloper dev = new SoftwareDeveloper();
		dev.id = 345;
		dev.name = "Xyz";
		dev.salary = 743543.34;
		dev.age = 22;
		dev.languages = "Java";
		dev.printSoftwareDev();
		
	}
}

class Person {
	String name;
	double age;
	public void printPerson() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

// Employee IS-A Person
class Employee extends Person {
	int id;
	double salary;
	public void printEmployee() {
		System.out.println("Id : " + id);
		System.out.println("Salary : " + salary);
	}
}
// SoftwareDeveloper IS-A Employee
class SoftwareDeveloper extends Employee {
	String languages;
	public void printSoftwareDev() {
		printPerson();
		printEmployee();
		System.out.println("Programing Lang. : " + languages);
	}
}









