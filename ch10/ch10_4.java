package ch10;

import java.util.Scanner;

public class ch10_4 {

	public static void main(String[] args) {
		int[] lottery = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number you want, plz");
		int num = scanner.nextInt();
		
		for( int i = 1 ; i <= num ; i++) {
			System.out.printf("%d : \t", i);
			for(int n = 1; n <=49; n++) 
				lottery[n] = n;
			int counter = 1;
			while (counter <= 6) {
				int lotteryNum = (int) (Math.random() * (49 -1 + 1)) +1;
				if (lottery[lotteryNum] == 0)
					continue;
				else {
				System.out.printf("%d \t", lotteryNum);
				lottery[lotteryNum] = 0;
				counter++;
				}
				}
				System.out.printf("\n");
			}
			
		

	}

}
