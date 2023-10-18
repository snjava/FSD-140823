public class SleepJoin {
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
			SleepJoinThread thread = new SleepJoinThread();
			thread.start();
			try {
				thread.join(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i =1; i<=10; i++) {
				System.out.println("i = " + i);
			}
		System.out.println("Main Thread Ends");
	}
}

class SleepJoinThread extends Thread {
	public void run() {
		System.out.println("Table Thread Started");
		for(int i = 1; i<=10 ; i++) {
			System.out.println("12 * " + i + " = " + (12*i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Table Thread Ends");
	}
}

