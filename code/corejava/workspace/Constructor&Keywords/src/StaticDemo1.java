
public class StaticDemo1 {
	public static void main(String[] args) {
		System.out.println(Person.a);
		Person.introduction();
		
		Student1.StudentAttendence attendence = new Student1.StudentAttendence();
		Student1.StudentProgress progress = new Student1.StudentProgress();
	}
}

class Person {
	static int a; // static variable
	int b;
	
	static {	// static block
		a = 100;
	}
	
	public Person() {
		b = 30;
	}
	
	public static void introduction() {		// static method
		System.out.println("Hello.. I am a Person..");
		System.out.println(a);
	}
}

class Student1 {
	static class StudentAttendence {		// static class
		int a = 10;
		public void m() {
			
		}
	}
	
	static class StudentProgress {
		
	}
	
	class StudentPlacement {
		
	}
}