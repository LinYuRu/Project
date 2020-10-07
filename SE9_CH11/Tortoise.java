package SE9_CH11;

public class Tortoise extends Thread {
	private int totalStep;
	private int step;
	
	public Tortoise(int totalStep) {
		this.totalStep = totalStep;
	}

	@Override
	public void run() {
		while(step<totalStep) {
			step++;
			System.out.printf("烏龜跑了 %d 步... %n", step);
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
