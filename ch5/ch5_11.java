package ch5;

import java.util.Scanner;

public class ch5_11 {

	public static void main(String[] args) {
		int year;
		int rem4, rem100, rem400;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("判斷輸入年份是否為潤年");
		System.out.println("請輸入任一年份");
		year = scanner.nextInt();
		rem4 = year % 4;
		rem100 = year % 100;
		rem400 = year % 400;
		if (rem4 == 0)
			if( rem100 != 0 || rem400 == 0)
				System.out.printf("%d 是閏年", year);
			else
				System.out.printf("%d 不是閏年", year);
		else
			System.out.printf("%d 不是閏年", year);

	}

}
