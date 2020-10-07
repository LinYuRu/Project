package ch20;

public class ch20_3_1 {

	public static void main(String[] args) {
		int[] x = {5, 6, 7, 8, 9};
		int sum = 0;
		for( int i = 0; i <= x.length ; i++) {
			sum += x[i];
			System.out.printf("索引值 : %d, 加總結果 : %d\n", i, sum);
		}

	}

}
