import java.util.Scanner;

public class ArrayDemo5 {
	public static void main(String[] args) {
		double price[][];
		price = new double[3][];
		price[0] = new double[5];
		price[1] = new double[3];
		price[2] = new double[4];

		Scanner scan = new Scanner(System.in);
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c < price[r].length; c++) {
				price[r][c] = scan.nextDouble();
			}
		}
		scan.close();
		
		for(double row[] : price) {
			for(double value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
	}
}
