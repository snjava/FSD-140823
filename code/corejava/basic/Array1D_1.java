public class Array1D_1 {
	public static void main(String args[]) {
		/*double percent[] = new double[5];
		percent[0] = 78.76;
		percent[1] = 67.16;
		percent[2] = 87.96;
		percent[3] = 81.61;
		percent[4] = 77.72;*/
		
		//double percent[] = new double[] {78.76, 67.16, 87.96, 81.61, 77.72};

		double percent[] = {78.76, 67.16, 87.96, 81.61, 77.72};
		

		System.out.println(percent.length); // array size
		// last index = array.length - 1
		System.out.println(percent.length - 1); // array last index		

		for(int index = 0 ; index<=4 ; index++) {
			System.out.println(percent[index]);
		}
		System.out.println("=========");
		for(double val : percent) {
			System.out.println(val);
		}
	}
}


