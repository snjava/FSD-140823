public class Operator4 {
	public static void main(String args[]) {
		int a = 20;
		int b = 5;
		System.out.println(a & b);	// 0
		System.out.println(a | b);	// 15

		System.out.println(a>=1 & a<=20);//true	
		System.out.println(a>=1 | a<=20);//true	

		int x = 10;
		System.out.println(x>=1 && x<=10);//true
		System.out.println(x>=1 || x<=10);//true	

		int age = 20;
		char ch = age>=23 ? 'A' : 'T';
		System.out.println(ch);		//true		
	}
}