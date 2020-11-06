package ch7_Array;

public class ch7_27 {

	public static void main(String[] args) {
		int[][] degree = {
				{25, 27, 29, 28, 26, 30, 28},
				{23, 25, 27, 26, 24, 28, 26},
				{21, 23, 25, 27, 21, 19, 14}
		};
		double sum, avg;
		String str = "";
		for(int i = 0; i < degree.length; i++) {
			sum = 0;
			for(int de: degree[i]) 
				sum+=de;
			avg = sum/degree[i].length;
				switch(i){
				case 0:
					str = "最高溫平均: ";
					break;
				case 1:
					str = "平均溫平均: ";
					break;
				case 2:
					str = "最低溫平均: ";
					break;
				}
				System.out.printf("%s %5.2f\n", str, avg);
			}
		}

	

}
