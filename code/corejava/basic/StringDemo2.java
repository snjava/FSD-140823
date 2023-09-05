public class StringDemo2 {
	public static void main(String a[]) {
		String s1 = "Hello Java";
		System.out.println(s1.length());
		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2); // HELLO JAVA
		System.out.println(s2.toLowerCase()); // hello java
		
		String s3 = " Program";
		System.out.println(s1.concat(s3)); //  Hello Java Program
		System.out.println(s1 + s3); //  Hello Java Program

		String s4 = "Welcome"; // 'W' 'e' 'l' 'c' 'o' 'm' 'e'
		System.out.println(s4.charAt(3)); // c
		System.out.println(s4.indexOf('e')); // 1
		System.out.println(s4.lastIndexOf('e')); // 6

		String s5 = "     ";
		System.out.println(s5.trim().isEmpty());
		System.out.println(s5.isBlank()); // JDK 11
		System.out.println(s5);	
		System.out.println(s5.trim());

		String s6 = "12-05-2002";
		String arr[] = s6.split("-");
		System.out.println("Day : " + arr[0]);
		System.out.println("Month : " + arr[1]);
		System.out.println("Year : " + arr[2]);

		String s7 = "Demo";
		char ch[] = s7.toCharArray(); 
		for(int i = ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		String s8 = "Resume_image.pdf";
		System.out.println(s8.endsWith(".pdf"));
		System.out.println(s8.startsWith("Resume"));
	}
}











