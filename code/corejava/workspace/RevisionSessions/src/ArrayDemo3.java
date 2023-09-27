
public class ArrayDemo3 {
	public static void main(String[] args) {
		int array[][];
		array = new int[2][3];

		array[0][0] = 34;
		array[0][1] = 14;
		array[0][2] = 24;

		array[1][0] = 41;
		array[1][1] = 64;
		array[1][2] = 71;

		System.out.println("======nested for loop========");
		for (int r = 0; r <= 1; r++) {
			for (int c = 0; c <= 2; c++) {
				System.out.print(array[r][c] + "\t");
			}
			System.out.println();
		}

		System.out.println("======enhance for loop======");
		for (int row[] : array) {
			for (int column : row) {
				System.out.print(column + "\t");
			}
			System.out.println();
		}
	}
}
