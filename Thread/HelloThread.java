package Thread;

public class HelloThread extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			String tName = Thread.currentThread().getName();
			System.out.println(tName + " : " + i);
		}

	}

}
