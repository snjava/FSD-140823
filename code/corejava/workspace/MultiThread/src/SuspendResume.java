public class SuspendResume {
	public static void main(String[] args) {
		System.out.println("Main Thread Started");
			SuspendResumeThread thread = new SuspendResumeThread();
			thread.start();
			thread.suspend();
			for(int i =1; i<=10; i++) {
				System.out.println("i = " + i);
			}
		System.out.println("Main Thread Ends");
		
		thread.resume();
	}
}

class SuspendResumeThread extends Thread {
	public void run() {
		System.out.println("Table Thread Started");
		for(int i = 1; i<=10 ; i++) {
			System.out.println("12 * " + i + " = " + (12*i));
		}
		System.out.println("Table Thread Ends");
	}
}

