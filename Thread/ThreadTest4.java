package Thread;

public class ThreadTest4 {

	public static void main(String[] args) {
		HelloThread r1 = new HelloThread();
		HelloThread r2 = new HelloThread();
		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		int num = t1.getPriority();
		System.out.println("num : "+num);
		t1.start();
		t2.start();

	}

}