import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		map.put(123, "Abc");
		map.put("Xyz", 321);
		map.put(123, 123);
		map.put(1.23, 'A');
		map.put(true, "Abc");
		//map.put(null, "A");
		//map.put(null, "B");
		//map.put(1, null);
		//map.put(2, null);
		//map.put(null, null);
		
		System.out.println(map);
		//map.remove(123); // remove using KEY
		map.remove(123, "PRQ"); // remove using KEY and VALUE
		System.out.println(map);
		System.out.println(map.containsKey(1.23)); 
		System.out.println(map.containsValue("Xyz")); 
		//map.clear();
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		System.out.println(map.values());
		System.out.println(map.keySet());
	}
}
