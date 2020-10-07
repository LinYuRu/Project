package ch19;

import java.util.Random;
import java.util.Scanner;

public class ch19_3 {

	public static void main(String[] args) {
		Random ran = new Random();
		int pwd = ran.nextInt(10);
		int num;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("猜一猜0-9的數字");
			num = scanner.nextInt();
			if( num == pwd) {
				System.out.println("恭喜猜中數字");
				break;
			}
			if( num > pwd )
				System.out.println("猜錯了猜小一點");
			else
				System.out.println("猜錯了猜大一點");
		}
		
		

	}

}
