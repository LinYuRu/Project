package JavaPractice;

public class Logic_prac04_ex6 {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int b = n-1; b > 0; b--) {
			for (int h = 0; h < n - b; h++) {
				System.out.print(" ");
			}
			for (int a = 0; a < b; a++) {
				System.out.print("* ");
			}
				System.out.println();
			
		}


	}

}
