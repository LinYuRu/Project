package ch7;


public class ch7_13 {
	public static void main(String[] args) {
		int[] score = {90,84, 72, 59, 39};
		int passingscore = 60;
		for(int i=0; i<score.length;i++) {
			if(score[i]<passingscore)
				System.out.printf("score[%d] = %d\n", i, score[i]);
		}
//		for(int num:score) {
//			if(num<passingscore)
//				System.out.println(num);
//		}
	}

}
