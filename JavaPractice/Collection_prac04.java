package JavaPractice;

import java.util.Random;
import java.util.TreeSet;

class Lottory {

	public TreeSet<Integer> playLottoSet() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Random rd = new Random();
		for (int i = 1; i <= 6; i++) {
			int num = rd.nextInt(42);
			ts.add(num);
		}
		System.out.println("playLottoSet方法: "+ts);
		return ts;
	}
}

public class Collection_prac04 {

	public static void main(String[] args) {
		Lottory lt = new Lottory();
		lt.playLottoSet();

	}

}
