package ch21;
class HorseRace3 extends Thread{
	private String name;

	HorseRace3(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(getName() + " 正在跑第" + i + "圈");
		}
	}
	
}
public class ch21_7 {

	public static void main(String[] args) {
		HorseRace3 hr1 = new HorseRace3("Horse1");
		HorseRace3 hr2 = new HorseRace3("Horse2");
		Thread h1 = new Thread(hr1);
		Thread h2 = new Thread(hr2);
		h1.start();
		h2.start();

	}

}
