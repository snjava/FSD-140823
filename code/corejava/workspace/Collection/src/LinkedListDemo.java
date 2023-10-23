import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(234);
		list.add("Abc");
		list.add(234);
		list.add(2.34);
		list.add('A');
		System.out.println(list);
		list.add(2, "PQR");
		System.out.println(list);		
		
		list.addFirst(1111);
		list.addLast(5555);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		list.push("AAA");
		System.out.println(list);
		System.out.println(list.pop()); // throws exception if no first element present
		System.out.println(list);
		System.out.println(list.poll()); // return null if no first element present
		System.out.println(list);
		System.out.println(list.peek()); // select the first element and not removes it
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}









