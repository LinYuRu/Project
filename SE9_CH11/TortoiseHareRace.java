package SE9_CH11;

public class TortoiseHareRace {

	public static void main(String[] args) {
		boolean[] flags = { true, false };
		int totalStep = 10;
		int tortoiseStep = 0;
		int hareStep = 0;
		System.out.println("Game start");
		while (tortoiseStep < totalStep && hareStep < totalStep) {
			tortoiseStep++;
			System.out.printf("烏龜跑了 %d步... %n", tortoiseStep);
			boolean isHareSleep = flags[((int) (Math.random() * 10)) % 2];
			if (isHareSleep) {
				System.out.println("兔子睡著了");
			} else {
				hareStep += 2;
				System.out.printf("兔子跑了 %d 步...%n", hareStep);
			}
		}

	}

}
