import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(456);
		set.add(46);
		set.add(56);
		set.add(16);
		set.add(46);
		set.add(56);
		set.add(456);
		set.add(11);
		set.add(656);
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		// return the higher value than the provided one
		System.out.println(set.higher(46)); // 56
		// return the lower value than the provided one
		System.out.println(set.lower(46)); // 16
		
		// return the equal or higher value than the provided one
		System.out.println(set.ceiling(46)); // 46
		// return the equal or lower value than the provided one
		System.out.println(set.floor(46)); // 46
		
		System.out.println(set.headSet(46));
		System.out.println(set.tailSet(46));
		
	}
}
