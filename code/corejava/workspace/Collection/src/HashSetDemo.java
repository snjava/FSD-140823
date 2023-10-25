import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet(20, 0.90f);
		set.add(234);
		set.add("ABC");
		set.add('A');
		set.add(234);
		set.add("PQR");
		set.add("ABC");
		set.add('A');
		System.out.println(set);
		set.remove('A');
		System.out.println(set);
		
	}
}
