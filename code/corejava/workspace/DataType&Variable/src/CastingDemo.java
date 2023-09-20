
public class CastingDemo {
	public static void main(String[] args) {
		byte a = 10;
		int b = a; // implicit casting
		
		int x = 30;
		byte y = (byte) x; // explicit casting
		
		int z = 45;
		z = (int) (z * 45.43);
		System.out.println(z);
	}
}
