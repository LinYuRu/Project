package ch8;

import javax.xml.crypto.Data;

public class ch8_21 {

	public static void main(String[] args) {
		double[] data = {1, 2, 3, 4, 5.5};
		System.out.println(add(data)/data.length);
		
	}
		public static double add(double []nums) {
			double sum = 0;
			for ( double num: nums)
			sum += num;
			return sum;
		}
		
//		int[] data = {1, 2, 3, 4, 5};
//		System.out.println(add(data)/data.length);
//
//	}
//	public static int add(int[] nums) {
//		int sum = 0;
//		for(int num:nums)
//			sum+=num;
//			return sum;
//}

}
