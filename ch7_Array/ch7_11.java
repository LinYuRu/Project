package ch7_Array;

public class ch7_11 {

	public static void main(String[] args) {
		double[] score = {69, 20, 90, 77};
		double total = 0;
		for( double sc:score) {
			total += sc;
		}
		
		System.out.println("average: " + total/score.length);

	}

}
