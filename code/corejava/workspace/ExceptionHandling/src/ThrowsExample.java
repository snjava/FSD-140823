import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
	public static void main(String[] args) {
		double arr[] = {34,45,75,8,74,457,58,9,45};
		//processData(arr);
		try {
			processData(null, "c:\\test.txt");
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void processData(double marks[], String fileName) throws NullPointerException, FileNotFoundException {
		FileReader read = new FileReader(fileName);
		double add = 0;
		for(double val : marks) {
			add += val;
		}
		System.out.println("Addition is : " + add);	
	}
}
