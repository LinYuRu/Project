package ch20_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch20_8 {

	public static void main(String[] args) {
		int x1, x2;
		Scanner scanner = new Scanner(System.in);
		String z = "y";
		
		
		System.out.println("請輸入兩個整數(數字間用空白格開)  : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("數字除法結果是 :  " + (x1/x2));
		}
		catch (ArithmeticException e) {
			System.out.println("除數為零的異常 : " + e);
		}
		catch ( InputMismatchException e) {
			System.out.println("輸入資料類型錯誤" +e);
		}
		System.out.println("ch20_8.java程式結束");


		}

}
