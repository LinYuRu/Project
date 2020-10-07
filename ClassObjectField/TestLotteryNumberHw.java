package ClassObjectField;

public class TestLotteryNumberHw {
	int[] count = new int[42];
	int[] number = new int[42];
	{

		for (int i = 1; i <= 100000; i++) {
			int rNum = (int) (Math.random() * 42 + 1);
			// system.out.println("rNum ="+rNum);
			count[rNum - 1]++;
		}
		for (int j = 1; j <= 42; j++) {
			number[j - 1] = j;
		}

	}

	public void numberSort1() {

		for (int i = 0; i < count.length - 1; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if (count[i] < count[j]) {
					int temp1 = 0;
					int temp2 = 0;
					temp1 = count[i];
					count[i] = count[j];
					count[j] = temp1;

					temp2 = number[i];
					number[i] = number[j];
					number[j] = number[i];
				}
			}
		}
	}

	public void printResult() {
		for (int k = 0; k < count.length; k++) {
			System.out.printf("%02d:%d\t", number[k], count[k]);
			if ((k + 1) % 6 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		TestLotteryNumberHw lottery = new TestLotteryNumberHw();
		lottery.createLotteryNumber();

		System.out.println("Original Data:");
		System.out.println("-----------------------------------------------------------");

		lottery.printResult();

		System.out.println("-----------------------------------------------------------");

		System.out.println("Sorted Data:");
		System.out.println("-----------------------------------------------------------");

		lottery.numberSort1();
		lottery.printResult();

		System.out.println("-----------------------------------------------------------");
	}

}
