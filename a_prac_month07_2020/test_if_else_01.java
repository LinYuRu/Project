package a_prac_month07_2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class test_if_else_01 {
	public static int rm() {
		Random random = new Random();
		int num = random.nextInt(24);
		return num;
	}

	public static int lottery() {
		Random random = new Random();
		int num = random.nextInt(24) + 100;
		return num;
	}

	public static void main(String[] args) {
		int a = 0, b = 2, c = 0;
		boolean d = false;
		c = b == c ? lottery() : rm();
//		System.out.println(c);
		
		if(c==1) {
			rm();
		} else {
			lottery();
		}
		


	}

}
