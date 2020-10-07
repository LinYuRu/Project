package ch20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ch20_8_ex {

	public static void main(String[] args) {
		int x1, x2;
		String pass = "y";
		Scanner scanner = new Scanner(System.in);
		
		for ( int i = 0; i<99; i++) {
		
		
		System.out.println("請輸入兩個整數(數字間用空白格開)  : ");
		try {
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			System.out.println("數字除法結果是 :  " + (x1/x2));
		}
		catch (ArithmeticException e) {
			System.out.println("除數為零的異常 : " + e);
			break;
		}
		catch ( InputMismatchException e) {
			System.out.println("輸入資料類型錯誤" +e);
			break;
		}
		System.out.println("ch20_8.java程式結束");
		
		}

		}

}
