package ch7_Array;

public class ch7_14 {

	public static void main(String[] args) {
		int[] score = {90,84, 72, 59, 39};
		int temp;
		for(int i = 0; i<(score.length - 1); i++) {
			for(int j=0; j<(score.length-i-1);j++) {
				if(score[j]>score[j+1]) {
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
			System.out.printf("列出第%d次迴圈排序結果\n", (i+1));
			for(int sc:score)
				System.out.printf("%d ", sc);
			System.out.println("");
		}

	}

}
