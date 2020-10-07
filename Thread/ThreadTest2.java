package Thread;

public class ThreadTest2 {

	public static void main(String[] args) {
		HelloThread t1 = new HelloThread();
		t1.setName("T1");
		t1.start();
		System.out.println("Available Thread : "+ Thread.activeCount() + "colunm");

	}

}
