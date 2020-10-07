package ClassObjectField;

public class TestNumberSortEx1 {
	int[] data = { 5, 12, 7, 26, 9 };

	public void numberSort1() {
		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length; j++) {
				int temp = 0;

				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	public void numberSort2() {
		// 2.無限迴圈下去排序
		while (true) {
			// 3.計算排序交換次數，交換次數為0則停止
			int count = 0;
			// 1.先排序
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
			System.out.printf("data[%d]=%d\n", k, data[k]);
		}
	}

	public static void main(String[] args) {
		TestNumberSortEx1 sort1 = new TestNumberSortEx1();
		//sort1.numberSort1();
		sort1.numberSort2();
		sort1.printResult();
	}

}

