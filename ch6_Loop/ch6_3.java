package ch6_Loop;

public class ch6_3 {

	public static void main(String[] args) {
		int sum = 0;
		for ( int i = 1; i<=10; i++) {
			sum += i;
			System.out.printf("Loop = %2d, SUM = %2d%n", i, sum);
		}

	}

}
