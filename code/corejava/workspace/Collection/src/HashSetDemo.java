import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(234);
		set.add("ABC");
		set.add('A');
		set.add(234);
		set.add("PQR");
		set.add("ABC");
		set.add('A');
		System.out.println(set);
	}
}
