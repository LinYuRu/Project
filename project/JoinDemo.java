package project;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread start");
		
		Thread threadB = new Thread() ;
			System.out.println("ThreadB  start");
			for(int i=0;i<5;i++) {
				System.out.println("Thread B execute");
			}
			System.out.println("Thread B break");
		
			threadB.start();
			Thread.currentThread().getThreadGroup().getName();
			threadB.join();
			System.out.println("Main thread break");
			
	}

}
