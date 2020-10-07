package TestIOPractice;

class TestMyThread implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "i=" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class CallTestThreadEx1 {

	public static void main(String[] args) {
		TestMyThread test1 = new TestMyThread();
		Thread thread1 = new Thread(test1);
		Thread thread2 = new Thread(test1);
		thread1.start();
		thread2.start();

		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Finished");

	}

}
