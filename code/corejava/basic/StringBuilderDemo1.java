public class StringBuilderDemo1 {
	public static void main(String a[]) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb); // Hello
		sb.append(" Program");
		System.out.println(sb); // Hello Program
		sb.insert(5, " Java"); 
		System.out.println(sb); // Hello Java Program
		sb.delete(0, 6);
		System.out.println(sb); // Java Program
		sb.reverse();
		System.out.println(sb); // margorP avaJ
	}
}