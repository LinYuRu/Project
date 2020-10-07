package SE9_CH11;

public class Hare  extends Thread  {
	private boolean[] flags = { true, false };
	private int totalStep;
	private int step;

	public Hare(int totalStep) {
		this.totalStep = totalStep;
	}

	@Override
	public void run() {
		while (step < totalStep) {
			boolean isHareSleep = flags[((int) (Math.random() * 10) % 2)];
			if (isHareSleep) {
				System.out.println("兔子睡著了zzz");
			} else {
				step += 2;
				System.out.printf("兔子跑了 %d 步...%n", step);
			}
		}

	}

	public int getTotalStep() {
		return totalStep;
	}

	public void setTotalStep(int totalStep) {
		this.totalStep = totalStep;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

}
