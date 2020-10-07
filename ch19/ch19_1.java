package ch19;

import java.util.Scanner;

public class ch19_1 {

	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入圓半徑: ");
		r = scanner.nextDouble();
		System.out.println("圓周長: " + (2*Math.PI * r));

	}

}
