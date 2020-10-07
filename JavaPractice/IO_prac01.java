package JavaPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class IO_prac01 {

	public static void main(String[] args) {
		int k = 100;// 樂透筆數
		String num = null;
		Random random = new Random();
		int[] lotto;
		ArrayList<String> list = new ArrayList<String>();
		HashMap<Integer, ArrayList> mp = new HashMap<Integer, ArrayList>();
		for (int g = 1; g <= k; g++) {
			list.add("[");
			for (int i = 1; i <= 5; i++) {
				num = String.valueOf(random.nextInt(42));
				list.add(num);
				list.add(",");
			}
			list.add(String.valueOf(random.nextInt(42)));
			list.add("]");
			list.add("\n");

			mp.put(g, list);
		}
		
		try {
			FileOutputStream ob = new FileOutputStream("D:\\download\\Lotto.txt");
			Iterator<String> it = mp.get(2).iterator();
			while (it.hasNext()) {

				String str = (String) it.next();
				byte[] bArray = str.getBytes();
				ob.write(bArray);

			}

			ob.close();
			System.out.println("輸出成功!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
