package JAVA;

public class Diamond {

	public static void main(String[] args) {
		
		int layer =5;
		
		for(int i = 1; i <= layer ; i++) {
			
			int spaceNum = layer - i;
			for (int j = 1; j <= spaceNum ; j++) {
				System.out.print(" ");
			}
			int starNum = 2*i-1;
			for(int k =1; k<=starNum; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i<layer;i++) {
			int spaceNum = i+2;
			for(int j=1;j<spaceNum;j++) {
				System.out.print(" ");
			}
			int starNum = 2*(layer-i)-1;
			for(int k=1;k<starNum;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.printf("*\t");
//			}
//			System.out.println();
//		}
//		for (int i = 4; i >= 1; i--) {
//			for (int k = 1; k <= i; k++) {
//				System.out.printf("*\t");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 7; j++) {
//				if (j >= 3 - i && j <= 3 + i) {
//					System.out.print("*");
//				}
//
//				else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println("");
//		}
//
//		for (int i = 2; i >= 0; i--) {
//			for (int j = 0; j < 7; j++) {
//				if (j >= 3 - i && j <= 3 + i) {
//					System.out.print("*");
//				}
//
//				else {
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println("");
//		}
	}

}
