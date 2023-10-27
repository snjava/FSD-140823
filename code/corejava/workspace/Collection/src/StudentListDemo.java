import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentListDemo {
	public static void main(String[] args) {
		Student s1 = new Student(11, "Abc", "Pune");
		Student s2 = new Student(31, "Xyz", "Mumbai");
		Student s3 = new Student(122, "Pqr", "Delhi");
		Student s4 = new Student(43, "Lmn", "Pune");
		Student s5 = new Student(12, "Stu", "Pune");
		
		/**
		 * Generic Type
		 * 	1. Is use to specify the the type of object allowed inside collection
		 *  2. Generic type will be provided at the declaration and instantiation 
		 *  of the collection using '<ClassName>' bracket
		 *  3. Generic type must be a class name either it can be Custom Class or build in class. 
		 */
		List<Student> studList = new ArrayList<Student>();
		studList.add(s1);
		studList.add(s2);
		studList.add(s3);
		studList.add(s4);
		studList.add(s5);
		
		//System.out.println(studList);
		//printDetailsByIterator(studList);
		//System.out.println("****************************************");
		//printDetailsByListIterator(studList);
		printDetailsByEnhanceFor(studList);
	}
	
	public static void printDetailsByEnhanceFor(List<Student> studList) {
		for(Student obj : studList) {
			System.out.println("Id : " + obj.getId());
			System.out.println("Name : " + obj.getName());
			System.out.println("City : " + obj.getCity());
			System.out.println("--------------------------------");
		}
	}
	
	public static void printDetailsByIterator(List<Student> studList) {
		Iterator<Student> it = studList.iterator();
		while(it.hasNext()) {
			Student obj = it.next();
			System.out.println("Id : " + obj.getId());
			System.out.println("Name : " + obj.getName());
			System.out.println("City : " + obj.getCity());
			System.out.println("--------------------------------");
		}
	}
	
	public static void printDetailsByListIterator(List<Student> studList) {
		ListIterator<Student> it = studList.listIterator();
		while(it.hasNext()) {
			Student obj = it.next();
			System.out.println("Id : " + obj.getId());
			System.out.println("Name : " + obj.getName());
			System.out.println("City : " + obj.getCity());
			System.out.println("--------------------------------");
		}
		
		System.out.println("**********Backword Direction******");
		
		while(it.hasPrevious()) {
			Student obj = it.previous();
			System.out.println("Id : " + obj.getId());
			System.out.println("Name : " + obj.getName());
			System.out.println("City : " + obj.getCity());
			System.out.println("--------------------------------");
		}
	}
	
	
	
}










