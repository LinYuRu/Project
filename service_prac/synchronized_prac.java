package service_prac;

public class synchronized_prac {

	public void doSth(String s) throws InterruptedException {
		synchronized (s.intern()) {
			System.out.println(s + "執行中");
			Thread.sleep(5000L);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a1 = new String("a");
		String a2 = new String("a");
		System.out.println(a1 == a2);
		System.out.println(a1.intern() == a2.intern());
		final synchronized_prac INTERN_TEST = new synchronized_prac();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					INTERN_TEST.doSth("a");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					INTERN_TEST.doSth("a");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					INTERN_TEST.doSth("b");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread1.start();
		thread3.start();
		thread2.start();
	}

}
