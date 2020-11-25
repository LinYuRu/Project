package JavaPractice_phctw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Logic_prac02 {

	public static void main(String[] args) {
		//給予隨機產生成績甲乙丙丁之評價
		Random s = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			int luck = s.nextInt(100);
			int k = luck / 10;
			list.add(luck);
			switch (k) {
			case 10:
				System.out.println("甲: " + luck);
				break;
			case 9:
				System.out.println("乙: " + luck);
				break;
			case 8:
				System.out.println("丙: " + luck);
				break;
			case 7:
				System.out.println("丁: " + luck);
				break;
			case 6:
				System.out.println("戊: " + luck);
				break;
			case 5:
				System.out.println("己: " + luck);
				break;
			case 4:
				System.out.println("己: " + luck);
				break;
			case 3:
				System.out.println("己: " + luck);
				break;
			case 2:
				System.out.println("己: " + luck);
				break;
			case 1:
				System.out.println("己: " + luck);
				break;
			case 0:
				System.out.println("己: " + luck);
				break;
			}

		}

	}

}
