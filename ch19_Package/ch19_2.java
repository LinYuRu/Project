package ch19_Package;

public class ch19_2 {

	public static void main(String[] args) {
		double r;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("請輸入圓半徑: ");
		r = scanner.nextDouble();
		System.out.println("圓周長: " + (2*Math.PI * r));

	}

}
