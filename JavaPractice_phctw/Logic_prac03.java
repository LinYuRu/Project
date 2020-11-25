package JavaPractice_phctw;

import java.util.ArrayList;
import java.util.Scanner;

public class Logic_prac03 {

	static int[] pattern = { 5, 6, 7, 8 };

	public static void main(String[] args) {
		int x1, x2, x3, x4;
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入4個介於0~10之間的整數(數字間用空白隔開) : ");
		while (!scanner.hasNextInt()) {
			System.out.println("輸入第一個數字資料型態錯誤請輸入整數");
			scanner.next();
		}
		x1 = scanner.nextInt();
		if (x1 > 10 || x1 < 0) {
			System.out.println("第一個數字大小超出範圍");
		}
		while (!scanner.hasNextInt()) {
			System.out.println("輸入第二個數字資料型態錯誤請輸入整數");
			scanner.next();
		}
		x2 = scanner.nextInt();
		if (x2 > 10 || x2 < 0) {
			System.out.println("第二個數字大小超出範圍");
		}
		while (!scanner.hasNextInt()) {
			System.out.println("輸入第三個數字資料型態錯誤請輸入整數");
			scanner.next();
		}
		x3 = scanner.nextInt();
		if (x3 > 10 || x3 < 0) {
			System.out.println("第四個數字大小超出範圍");
		}
		while (!scanner.hasNextInt()) {
			System.out.println("輸入第四個數字資料型態錯誤請輸入整數");
			scanner.next();
		}
		x4 = scanner.nextInt();
		if (x4 > 10 || x4 < 0) {
			System.out.println("第四個數字大小超出範圍");
		}
		int numA = 0, numB = 0;
		int[] num = { x1, x2, x3, x4 };
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> patterns = new ArrayList<Integer>();
		for (int g = 0; g <= 3; g++) {
			b.add(num[g]);
			patterns.add(pattern[g]);
		}
		for (int i = 0; i <= 3; i++) {
			if (patterns.contains(b.get(i))) {
				if (patterns.get(i).equals(b.get(i))) {
					numA++;
				} else {
					numB++;
				}
			}
		}

		String riddle = String.valueOf(numA) + "A" + String.valueOf(numB) + "B";
		System.out.println(riddle);

	}

}