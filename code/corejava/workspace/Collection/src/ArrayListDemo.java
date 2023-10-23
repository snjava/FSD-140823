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
		list.remove("Abcd");
		System.out.println(list);
		System.out.println(list.contains(2341));
		System.out.println(list.size());
		//list.clear();
		System.out.println(list.isEmpty());
		
		ArrayList list1 = new ArrayList();
		list1.add(1111);
		list1.add("AAAA");
		list1.add("PQRS");
		
		list.addAll(list1);
		System.out.println(list);
		
		ArrayList list2 = new ArrayList();
		list2.add(1111);
		list2.add("Abcd");
		list2.add(234);
		list2.add(555);
		list2.add("Test");
		
		//list.removeAll(list2);
		list.retainAll(list2);
		System.out.println(list);
		
		System.out.println(list.containsAll(list1));
	}
}
