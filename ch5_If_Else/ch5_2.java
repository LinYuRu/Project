package ch5_If_Else;

import java.util.Scanner;

public class ch5_2 {

	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入年齡 : ");
		age = scanner.nextInt();
		if ( age < 20)
			System.out.println("妳的年齡太小, 需成年才能飲酒");

	}

}
