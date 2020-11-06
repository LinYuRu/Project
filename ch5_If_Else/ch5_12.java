package ch5_If_Else;

import java.util.Scanner;

public class ch5_12 {

	public static void main(String[] args) {
		int score;
		Scanner scanner = new Scanner(System.in);
		System.out.println("計算最終成績");
		System.out.println("請輸入分數(0-99) : ");
		score = scanner.nextInt();
		switch (score / 10) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}

	}

}
