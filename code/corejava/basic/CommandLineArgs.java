public class CommandLineArgs {
	public static void main(String arr[]) {
		System.out.println("Commnad line Values");
		System.out.println(arr[0]);
		int n1 = Integer.parseInt(arr[1]);
		int n2 = Integer.parseInt(arr[2]);
		System.out.println(n1 + n2);
	}
}