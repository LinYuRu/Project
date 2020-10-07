package JavaFlowControl;

public class HourGlass {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int k = 3; k <= i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("**");
			}
			System.out.println();
		}

		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n - a; b++) {
				System.out.print(" ");
			}
			for (int c = 1; c <= a; c++) {
				System.out.print("**");
			}
			System.out.println();
		}
	}
}
