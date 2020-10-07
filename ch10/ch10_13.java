package ch10;

import java.util.Random;

public class ch10_13 {
	public static void main(String[] args) {
		Random ran = new Random();
		for (int i = 0 ; i < 4; i++) {
			System.out.printf("%d \t\n", ran.nextInt(100));
			System.out.printf("%d \t\n", ran.nextInt());
		}
	}

}
