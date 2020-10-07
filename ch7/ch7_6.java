package ch7;

public class ch7_6 {
	public static void main(String[] args) {
		int x= 3;
		int[]  z = new int[x];
		 z[1] = z[2] = z[0] = 1;
		 int sum =0;
		for(int i = 0; i<=x-1;i++) {
			sum += z[i];
		}		
		System.out.println(sum);
	}

}
