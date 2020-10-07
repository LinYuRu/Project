package ch8;

public class ch8_22 {

	public static void main(String[] args) {
		System.out.println(add(new int[] {1, 2, 3, 4, 5, 8}));

	}

	public static double add(int []nums) {
		int sum = 0;
		for (int num:nums)
			sum +=num;
		double avg = sum/nums.length;
		return avg;
	}
}
