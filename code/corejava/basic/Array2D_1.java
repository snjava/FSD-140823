public class Array2D_1 {
	public static void main(String args[]) {
		/*double marks[][];
		marks = new double[2][4];
		marks[0][0] = 67.65;
		marks[0][1] = 61.15;
		marks[0][2] = 77.61;
		marks[0][3] = 57.43;
		marks[1][0] = 87.25;
		marks[1][1] = 67.45;
		marks[1][2] = 98.61;
		marks[1][3] = 54.65;*/

		//double marks[][] = new double[][] {{67.65,61.15,77.61,57.43}, {87.25,67.45,98.61,54.65}};
		
		double marks[][] = {{67.65,61.15,77.61,57.43}, {87.25,67.45,98.61,54.65}};
		
		System.out.println(marks.length); // total number of rows
		System.out.println(marks[1].length); // total number of column from 1st row

		for(int r=0 ; r<=1; r++) {
			for(int c=0; c<=3; c++) {
				System.out.print(marks[r][c] + "\t");
			}
			System.out.println();
		}
			
	}
}