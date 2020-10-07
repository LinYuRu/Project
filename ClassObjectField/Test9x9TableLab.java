package ClassObjectField;

public class Test9x9TableLab {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%2d * %2d = %2d\t", i, j, i*j);
			}System.out.println();
		}
	}

}
