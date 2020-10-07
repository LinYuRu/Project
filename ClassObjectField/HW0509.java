package ClassObjectField;

public class HW0509 {
	int[] data = new int[42];
	{
		for (int x = 0; x < data.length; ++x) {
			data[x] = (int) (Math.random() * 42 + 1);
		}
	}

	public void numberSort2() {

		while (true) {
			int count = 0;
			for (int i = 0; i < data.length - 1; i++) {
				int temp = 0;
				if (data[i] < data[i + 1]) {
					temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					count++;
				}
			}
			
			if (count == 0) {
				break;
			}
		}
	}

	public void printResult() {
		for (int k = 0; k < data.length; k++) {
			System.out.printf("data[%d]=%d\n", k, data

			[k]);
		}
	}

	public static void main(String[] args) {
		HW0509 sort1 = new HW0509();

		// sort1.numberSort1();
		sort1.numberSort2();
		sort1.printResult();
	}
}
