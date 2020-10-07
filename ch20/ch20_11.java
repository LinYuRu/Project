package ch20;

import java.util.Scanner;

public class ch20_11 {

	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入兩個整數(數字間用空白格開)  : " );
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("數字除法結果是 : " + (x1 / x2));
		}
		catch (ArithmeticException e) {
			System.out.println("除數為零" + e);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("字串超出索引" + e);
		}
		catch (RuntimeException e) {
			System.out.println("異常發生" + e);
		}
		System.out.println("ch20_11.java程式結束");

	}

}
