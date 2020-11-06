package ch20_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch20_9 {

	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入兩個整數(數字間用空白格開)  : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("數字除法結果是 : " + (x1/x2));
		}
		catch (ArithmeticException | InputMismatchException e) {
			System.out.println("輸入錯誤 " + e);
		}
		System.out.println("ch20_9.java程式結束");

	}

}
