package JAVA;

public class ch7_13 {

	public static void main(String[] args) {
		int [] score = {90, 58, 80, 49, 92};
		int passingscore = 60;
		for(int i = 0 ; i <passingscore ; i++) {
			System.out.printf("score[%d] = %d \n", i, score[i]);
		}
		
//		int passingScore = 60;
//		for(int i =0 ; i <score.length; i++) {
//			if(score[i] < passingScore)
//			System.out.printf("score[%d] = %d\n", i, score[i]);
//		}

	}

}
