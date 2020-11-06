package ch5_If_Else;

import java.util.Scanner;

public class ch5_9 {

	public static void main(String[] args) {
		double price;
		int age;
		int ticket = 100;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("計算票價");
		System.out.println("請輸入年齡");
		age = scanner.nextInt();
		if (age >=80 || age <=6) {
			price = ticket *0.2;
			System.out.println("Ticket price is " + price);
		} else if (age >=60 || age <=12) {
			price = ticket * 0.5;
			System.out.println("Ticket price is " + price);
		} else {
			price = ticket;
			System.out.println("Ticket price is " + price);
		}

	}

}
