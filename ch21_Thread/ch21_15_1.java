package ch21_Thread;

public class ch21_15_1 {

	public static void main(String[] args) {
		Demo obj = new Demo();
		new Thread() {
			public void run() {
				obj.printDemo(10);
			};
		}.start();
		new Thread() {
			public void run() {
				obj.printDemo(100);
			}
		}.start();

	}

}
