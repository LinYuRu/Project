package ch5_If_Else;

import java.util.Scanner;

public class ch5_7 {

	public static void main(String[] args) {
		int age;
		Scanner scanner = new Scanner(System.in);	
		
		System.out.print("請輸入年齡 : ");
		age = scanner.nextInt();
		if (age <= 59 && age >=45) System.out.println("妳是中年人");
		else System.out.println("妳不是中年人");

	}

}
