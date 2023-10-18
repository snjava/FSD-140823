public class ThreadIntro {
	public static void main(String[] args) {
		System.out.println("Main STARTED");
		
		FirstCustomThread customThread = new FirstCustomThread(); // NEW STAGE
		customThread.setName("First-Thread");
		customThread.setPriority(10);
		customThread.start(); // RUNNABLE STAGE
	
		Thread thread = Thread.currentThread();
		System.out.println(thread); // Thread[Thread_Name, Thread_Priority, Thread_Group]
		
		System.out.println("Main END");
	}
}

class FirstCustomThread extends Thread {
	public void run() {   // RUNNING STAGE
		System.out.println("Custom Thread STARTED");
		//System.out.println(10/0);
		Thread thread = Thread.currentThread();
		//thread.stop();  // TERMINATE STAGE
		System.out.println(thread);
		System.out.println("Custom Thread END");
	}
}
