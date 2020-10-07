package JavaFlowControl;

public class TestArraySort {

	public static void main(String[] args) {
		int z;
		int[] x = { 3, 8, 5, 6, 9 };
		for (int i = 1; i < x.length; i++) {
			for (int j = 0; j < x.length; j++)
				if (x[i] < x[j]) {
					z = x[i];
					x[i] = x[j];
					x[j] = z;
				}

		}
		for (int k = 0; k < x.length; k++) {
			System.out.print(x[k]+"\t");
		}

	}

}
