import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Abcd");
		list.add("Xyz");
		list.add("Abcd");
		list.add("Lmn");
		
		System.out.println(list);
		list.add(1, "Test1");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.get(2));
		list.set(2, "Demo1");
		System.out.println(list);
	}
}
