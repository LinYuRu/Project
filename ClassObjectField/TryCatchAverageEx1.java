package ClassObjectField;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchAverageEx1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double sum = 0;
		int count = 0;
		while (true) {
			try {
				int number = console.nextInt();
				if (number == 0) {
					break;
				}
				sum += number;
				count++;
			} catch (InputMismatchException ex) {
				System.out.printf("���L�D��ƿ�J: %s%n", console.next());
			}
		}
		System.out.printf("����  %.2f%n", sum / count);
		console.close();
	}

}
