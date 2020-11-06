package ch13_RegularExpress;

import java.util.Scanner;

public class ch13_4 {

	public static void main(String[] args) {
		String s = new String();
		String pattern = "\\d";
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入任意字串 : ");
		s = scanner.next();
		if (s.matches(pattern))
			System.out.printf("%s : 是0-9數字\n", s);
		else
			System.out.printf("%s : 不是0-9數字\n", s);

	}

}
