/*
	1
	1	2
	1	2	3
	1	2	3	4
	1	2	3	4	5

ROW:	5
COLUMN:	5
*/

public class PatternDemo 
{
	public static void main(String args[]) {
		for(int r=1;r<=5;r++) {	// ROW
			for(int c=1;c<=r;c++) {	// Column
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}







