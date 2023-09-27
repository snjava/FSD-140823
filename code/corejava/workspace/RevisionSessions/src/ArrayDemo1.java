
public class ArrayDemo1 {

	public static void main(String[] args) {
		String names[];
		names = new String[5];
		names[0] = "Abc";
		names[1] = "Xyz";
		names[2] = "Lmn";
		names[3] = "Pqr";
		names[4] = "Stu";
		
		printValues(names);
	}
	
	public static void printValues(String arr[]) {
		System.out.println("Total Values : " + arr.length);
		System.out.println("Last Index : " + (arr.length-1));
		
		for(int i=0 ; i<= (arr.length-1) ; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("======Enhance Loop======");
		
		for(String val : arr) {
			System.out.println(val);
		}
	}

}
