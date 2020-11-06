package ch19_Package;

import java.util.Scanner;
import static java.lang.Math.PI;

public class ch19_6 {

	public static void main(String[] args) {
		double r;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入圓半徑: ");
		r = scanner.nextDouble();
		System.out.println("圓周長: " + (2 * PI * r));

	}

}
