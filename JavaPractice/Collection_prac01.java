package JavaPractice;

import java.util.Random;

class ArrayString {
	public String[] playLotto() {
		Random rd = new Random();
		StringBuffer buffer = new StringBuffer();

		for (int i = 1; i <= 6; i++) {
			int luck = rd.nextInt(42);
			if (luck < 10) {
				buffer = buffer.append(0);
				buffer = buffer.append(luck);
				buffer = buffer.append(",");
			} else {
				buffer = buffer.append(luck);
				buffer = buffer.append(",");
			}
		}
		System.out.println(buffer);
		String  strArr = buffer.toString();
		String[] lotto = strArr.split(",");
		return lotto;
	}
}

public class Collection_prac01 {
	public static void main(String[] args) {
		ArrayString as = new ArrayString();
		as.playLotto();
	}
}
