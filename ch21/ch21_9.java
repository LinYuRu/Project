package ch21;
class Xjoin extends Thread{
	Xjoin (String name){
		super(name);
	}
	public void run() {
		for (int i = 1; i<=5; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println(getName() + " is running: " + i);
		}
	}
}
public class ch21_9 {

	public static void main(String[] args) {
		Xjoin job1 = new Xjoin("job1");
		Xjoin job2 = new Xjoin("job2");
		Xjoin job3 = new Xjoin("job3");
		
		job2.start();
		job3.start();
		job1.start();
		try {
			job1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		

	}

}
