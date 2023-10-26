import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(123, "Abc");
		map.put(321, 321);
		map.put(123, 123);
		map.put(2, 'A');
		map.put(22, "Abc");
		map.put(89, "A");
		map.put(1, null);
		map.put(2, null);
		
		System.out.println(map);
		
		System.out.println(map.firstKey()); // 1
		System.out.println(map.firstEntry()); // 1=null
		System.out.println(map.lastKey()); // 321
		System.out.println(map.lastEntry()); // 321=321
		
		
		System.out.println(map.higherKey(22)); // 89
		System.out.println(map.higherEntry(22)); // 89=A
		System.out.println(map.lowerKey(22)); // 2
		System.out.println(map.lowerEntry(22)); // 2=null
		
		
		System.out.println(map.ceilingKey(22)); // 22
		System.out.println(map.ceilingEntry(22)); // 22=Abc
		System.out.println(map.floorKey(22)); // 22
		System.out.println(map.floorEntry(22)); // 22=Abc
		
		System.out.println(map.headMap(22)); // {1=null, 2=null}
		System.out.println(map.tailMap(22)); // {22=Abc, 89=A, 123=123, 321=321}
	}
}
