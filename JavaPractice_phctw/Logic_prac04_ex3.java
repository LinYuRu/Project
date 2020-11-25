package JavaPractice_phctw;

public class Logic_prac04_ex3 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.printf("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
//			System.out.printf("\n");
			System.out.println();
		}

	}

}
