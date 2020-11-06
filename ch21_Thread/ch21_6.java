package ch21_Thread;
class A implements Runnable{

	@Override
	public void run() {
		System.out.println("A is running");
		
	}
	
}

public class ch21_6 {

	public static void main(String[] args) {
		A a = new A();
		Thread t = new Thread(a);
		t.start();

	}

}
