package service_prac;

public class Period_prac {
	public static void main(String[] args) { // example.1
		long startTime, endTime = 0;
		int sum = 0;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			for (int j = 0; j < 50000; j++) {
				sum = i * j;
				if (sum > 2000000000) {
					endTime = System.currentTimeMillis();
					break;
				}
			}
		}
//		System.out.println("startTime: " + startTime);
//		System.out.println("endTime: " + endTime);
//		System.out.printf("花了 %d 毫秒", (endTime - startTime));

		double a = 1;
		System.out.println(a);
	}
}