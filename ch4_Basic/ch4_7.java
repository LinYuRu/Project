package ch4_Basic;

public class ch4_7 {

	public static void main(String[] args) {
		int i, j, value;
		i = j = 10;
		value = ++i * 10;
		System.out.println("value = " + value);
		value = j++ * 10;
		System.out.println("value = " + value);

	}

}
