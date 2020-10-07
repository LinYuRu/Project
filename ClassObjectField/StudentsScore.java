package ClassObjectField;

public class StudentsScore {

	public static void main(String[] args) {
		
		int[][] cords = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };
		for(int []row : cords) {
			for(int value:row) {
				System.out.printf("%2d", value);
			}
			System.out.println();
		}
//	        for(int x=0; x<cords.length;x++) {
//	           for(int y=0; y<cords[x].length;y++) {
//	        	   System.out.printf("%2d", cords[x][y]);
//	           }
//	           System.out.println();
//	        }
//		int [] score = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
//		System.out.println(score[3]);
//		for(int i = 0; i<=score.length; i++) {
//			System.out.printf("學生分數: %d %n", score[i]);
//		}

	}

}
