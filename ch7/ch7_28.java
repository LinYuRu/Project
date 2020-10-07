package ch7;

public class ch7_28 {

	public static void main(String[] args) {
		String[] str = {"最高溫平均: ", "平均溫平均: ", "最低溫平均: "};
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},
				{23, 25, 27, 26, 24, 28, 26},
				{21, 23, 25, 27, 21, 19, 14}
		};
		double sum, avg;
		for(int i = 0; i< degree.length;i++) {
			sum = 0;
			for(int de:degree[i]) 
				sum += de;
			avg = sum/degree[i].length;
			System.out.printf("%s %5.2f\n", str[i], avg);
		}

	}

}
