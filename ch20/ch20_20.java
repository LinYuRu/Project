package ch20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch20_20 {
	public static void myMethod() throws ArithmeticException, InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		int x1, x2;
		x1 = scanner.nextInt();
		x2 = scanner.nextInt();
		System.out.println("數字除法結果是 : " + (x1/x2));
	}

	public static void main(String[] args) {
		try {
			myMethod();
		}
		catch(ArithmeticException e) {
			System.out.println("除數為零的異常" + e);
		}
		catch(InputMismatchException e) {
			System.out.println("輸入資料型態錯誤" + e);
		}

	}

}
