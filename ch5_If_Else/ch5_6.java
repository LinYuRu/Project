package ch5_If_Else;

import java.util.Scanner;

public class ch5_6 {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸出絕對值的應用");
		System.out.println("請輸入任意整數 : ");
		x = scanner.nextInt();
		if(x>0) {
			System.out.println("絕對值是 " + x);
		}else
			System.out.println("絕對值是 " + -x);

	}

}
