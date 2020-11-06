package ch21_Thread;

class HorseRace2 extends Thread{
	private String name;

	HorseRace2(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(getName() + " 正在跑第" + i + "圈");
		}
	}
	
}

public class ch21_4 {

	public static void main(String[] args) {
		HorseRace2 h1 = new HorseRace2("Alex");
		HorseRace2 h2 = new HorseRace2("yyf");
		h1.start();
		h2.start();

	}

}
