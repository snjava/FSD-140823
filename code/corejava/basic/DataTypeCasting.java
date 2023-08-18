public class DataTypeCasting {
	public static void main(String args[]) {
		short s = 129;
		long l = s;  // implicit casting
		byte b = (byte)s;  // explicit casting

		System.out.println(s);
		System.out.println(l);
		System.out.println(b);
	}
}