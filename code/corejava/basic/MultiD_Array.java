public class MultiD_Array {
	public static void main(String args[]) {
		int array[][] = {{56,657,98,34},{43,76},{76,87,4,7,3}};

		System.out.println(array[2].length); // 5

		for(int r=0;r<array.length;r++) {
			for(int c=0;c<array[r].length;c++) 	{
				System.out.print(array[r][c] + "\t");
			}
			System.out.println();
		}
	}
}