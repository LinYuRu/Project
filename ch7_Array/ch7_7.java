package ch7_Array;

public class ch7_7 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int[] z = new int[y-x];
		z[0] = z[1] = 1;
		int sum = z[0] + z[1];
		System.out.println("sum: "+sum);

	}

}
