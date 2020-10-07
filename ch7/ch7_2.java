package ch7;

public class ch7_2 {

	public static void main(String[] args) {
		double average;
		double total = 0;
		double[] degree = new double[7];
		
		degree[0] =23;
		degree[1] =12;
		degree[2] =22;
		degree[3] =16;
		degree[4] =21;
		degree[5] =11;
		degree[6] =18;
		
		for ( int i = 0; i <7; i++) {
			total += degree[i];
			
		}
		average = total / 7;
		System.out.printf("一週平均溫度 : %5.2f", average);
	}

}
