import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedExample {

	public static void main(String[] args) {
		System.out.println("Main Started");	
		
		try {
			FileReader read = new FileReader("c:\\test.txt"); // Checked Exception
		} catch(FileNotFoundException ex) {
			
		}
		
		System.out.println(10/0); // Un-Checked Exception
		
		System.out.println("Main Ends");
	}

}
