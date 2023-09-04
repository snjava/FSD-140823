public class StringDemo1 {
	public static void main(String arr[]) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2); // F
		System.out.println(s2 == s3); // F
		System.out.println(s3 == s4); // F
		System.out.println(s1 == s3); // T
		System.out.println(s1 == "Hello");// T
		System.out.println(s1 == "HELLO");// F

		String s5 = "Hello";
		String s6 = "HELLO";

		System.out.println(s1.equals(s2));
		System.out.println(s5 == s6); // F
		System.out.println(s5.equalsIgnoreCase(s6)); // T

	}
}