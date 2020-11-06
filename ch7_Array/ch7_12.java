package ch7_Array;

public class ch7_12 {

	public static void main(String[] args) {
		int[] score = {90, 95, 20, 45, 78};
		int max, min;
		max = min = score[0];
		for( int sc:score) {
			if ( sc > max) 
				max = sc;
			if( sc < min)
				min = sc;
		}
		System.out.println("Max: " + max);
		System.out.println("min: " + min);
	}

}
