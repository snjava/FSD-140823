/*
88
777
6666
55555
444444
3333333
22222222
111111111

 */

public class Pattern {

	public static void main(String[] args) {
		for(int i = 8 ; i>=1; i--) {
			for(int j = 9; j>=i ; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
