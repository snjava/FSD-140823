
public class WhileLoopDemo {

	public static void main(String[] args) {
		
		System.out.println("======while=======");
		int i = 11;
		while(i<=10) {
			System.out.println(i + ".Hello");
			i++;
		}
		
		System.out.println("======do-while=======");
		int j=11;
		do {
			System.out.println(j + ".Hello");
			j++;
		} while(j<=10);
	}

}
