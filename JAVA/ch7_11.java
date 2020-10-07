package JAVA;

public class ch7_11 {
	public static void main(String[] args) {
		double[] score = {90, 95, 80, 79, 92};
		double total = 0;
		for(double sc : score) {
			total+=sc;
			double average = total/score.length;
			System.out.printf("Average  = %5.2f %n", average);
		}
	}
}
