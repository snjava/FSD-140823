
public class ForLoopDemo {

	public static void main(String[] args) {
		for(int i = 1 ; i<=10 ; i++ ) {
			System.out.println(i);
		}
		
		System.out.println("===========Print Even number=========");
		for(int i =1 ; i<=50 ; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Print number between 1-50 which is divisible by 3 & 5");
		for(int i=1 ; i<=50; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
	}

}
