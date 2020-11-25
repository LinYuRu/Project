package JavaPractice_phctw;

public class Logic_prac01 {
	public static void main(String [] args) {
		//九九乘法
		for(int i = 1; i<=9;i++) {
			for(int j =1;j<=9;j++) {
				System.out.printf("%d * %d = %2d  ",i,j,i*j);
			}
			System.out.println();
		}
	}
}
