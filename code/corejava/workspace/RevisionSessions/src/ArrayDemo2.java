
public class ArrayDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Abc");
		Student s2 = new Student(11, "Pqr");
		Student s3 = new Student(211, "Lmn");
		Student s4 = new Student(12, "Stu");
		Student s5 = new Student(41, "Xyz");
		
		Student st[] = new Student[5];
		st[0] = s1;
		st[1] = s2;
		st[2] = s3;
		st[3] = s4;
		st[4] = s5;
		printStudentDetails(st);
		
	}
	
	public static void printStudentDetails(Student st[]) {
		for(Student s : st) {
			s.print();
		}
	}
}

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void print() {
		System.out.println("Id : " + id + "  Name : " + name);
	}
}