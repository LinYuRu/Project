package ch21;

public class ch21_18 {

	public static void main(String[] args) {
		String str1 = "Account";
		String str2 = "Pwd";
		Thread t1 = new Thread() {
			public void run() {
				synchronized(str1) {
					System.out.println("Thread1 : Lock Account");
					try {
						Thread.sleep(300);
					}catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str2) {
						System.out.println("Thread1 : Locked Pwd");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(str2) {
					System.out.println("Thread2 : Locked Pwd");
					try {
						Thread.sleep(300);
					}catch(Exception e) {
						System.out.println(e);
					}
					synchronized(str1) {
						System.out.println("Thread2 : Locked Account");
					}
				}
			}
		};
		t1.start();
		t2.start();

	}

}
