import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Abcd");
		list.add("Xyz");
		list.add("Abcd");
		list.add("Lmn");
		list.add(234); 
		list.add(435345.345);
		list.add('A');
		
		System.out.println(list);
	}
}
