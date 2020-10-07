package ch7;

public class ch7_5 {
	public static void main(String [] args) {

		double average, total = 0;
		double[] degree = {25, 22, 24, 20, 26, 21, 21};
		
		for(int i = 0; i< degree.length; i++) {
			total += degree[i];
		}
		average = total/degree.length;
		System.out.printf("一週平均溫度: %5.2f",  average);
	}
}
