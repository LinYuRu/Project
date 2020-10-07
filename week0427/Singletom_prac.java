package week0427;

class EagerInitialization {
	private EagerInitialization() {
	}

	private static EagerInitialization eager;

	public static EagerInitialization getInstance() {
		if (eager == null) {
			synchronized (EagerInitialization.class) {
				if (eager == null) {
					eager = new EagerInitialization();
				}
			}
		}
		return eager;
	}
}

class SingletonTest extends Thread {
	String mId;

	public SingletonTest(String id) {
		mId = id;
	}

	public void run() {
		EagerInitialization singleton = EagerInitialization.getInstance();
		if (singleton != null) {
			System.out.println(mId + "產生 Singleton:" + singleton.hashCode());
		}
	}
}

public class Singletom_prac {

	public static void main(String[] args) {
		EagerInitialization e1 = EagerInitialization.getInstance();
		EagerInitialization e2 = EagerInitialization.getInstance();
		System.out.println("e1'HashCode: " + e1.hashCode() + " e2'HashCode: " + e2.hashCode());
		System.out.println();

		Thread t1 = new SingletonTest("執行緒t1: ");
		Thread t2 = new SingletonTest("執行緒t1: ");
		t1.start();
		t2.start();

	}

}
