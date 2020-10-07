package JAVA;

public class ch7_12 {

	public static void main(String[] args) {
		int[] score = {90, 95, 80, 79, 92};
		int max, min;
		max = min = score[3];
		for(int sc : score) {
			if(sc > max)
				max = sc;
			if(sc < min)
				min = sc;
		}
		System.out.println("Max : "+max);
		System.out.println("min : "+min);
//		int [] score = {90, 95, 80, 79, 92};
//		int max, min;
//		max = min = score[0];
//		for(int sc : score) {
//			if(sc > max)
//				max = sc;
//			if(sc < min)
//				min = sc;
//			
//		}
//		System.out.println("Max : "+max);
//		System.out.println("Min : "+min);
	}
}
