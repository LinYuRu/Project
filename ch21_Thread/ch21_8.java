package ch21_Thread;
class HorseRacing extends Thread{
	HorseRacing(String name){
		super(name);
	}
	public void run() {
		for(int i = 1; i <=5; i++) {
				try {
					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(getName() + "正在跑第" + i + "圈...");
		}
	}
}
public class ch21_8 {

	public static void main(String[] args) {
		HorseRacing t1 = new HorseRacing("Horse1");
		HorseRacing t2 = new HorseRacing("Horse");
		t1.start();
		t2.start();

	}

}
