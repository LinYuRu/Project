package ch5;

import java.util.Scanner;

public class ch5_4 {

	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入年齡 : ");
		age = scanner.nextInt();
		if ( age < 20)
			System.out.println("妳的年齡太小");
		    System.out.println("需成年才能飲酒");
		    //不論如何上條程式一定會執行


	}

}
