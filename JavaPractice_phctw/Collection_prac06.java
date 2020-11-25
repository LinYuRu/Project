package JavaPractice_phctw;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Play {

	int k = 3; // 樂透張數

	public HashMap playLottoMap(Lottory lotto) {
		// Lottory定義在Collection_prac04

		HashMap<Integer, TreeSet<Integer>> hm = new HashMap<Integer, TreeSet<Integer>>();

		for (int i = 1; i <= k; i++) {
			hm.put(i, lotto.playLottoSet());
		}

		System.out.println("Key1's value: " + hm.get(1));
		System.out.println("Key2's value: " + hm.get(2));
		return hm;
	}
}

public class Collection_prac06 {

	public static void main(String[] args) {
		Play play = new Play();
		Lottory lt = new Lottory();
		play.playLottoMap(lt);

	}

}
