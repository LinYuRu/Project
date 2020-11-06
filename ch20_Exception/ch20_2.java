package ch20_Exception;

import java.util.Scanner;

public class ch20_2 {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入整數 : ");
		x = scanner.nextInt();
		for ( int i = 0; i < x ; i++ ) {
			for ( int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
