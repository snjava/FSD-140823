/*
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
ROW:	3
COLUMN:	5
*/

public class NestedForDemo {
	public static void main(String args[]) {
		for(int r = 1 ; r<=3 ; r++) {	// ROW
			for(int c=1 ; c<=5 ; c++) {	// Column
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}