package JavaPractice_phctw;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class IO_prac04 {

	public static void main(String[] args) {
		String p = "D:\\download\\Lotto_";
		for (int t = 1; t <= 20; t++) {
			String num1 = Integer.toString(t);
			String filename = p + num1 + ".txt";
			System.out.println(filename);

			try {

				int k = 100;// 樂透筆數
				String num = null;
				Random random = new Random();
				int[] lotto;
				ArrayList<String> list = new ArrayList<String>();
				HashMap<Integer, ArrayList<String>> mp = new HashMap<Integer, ArrayList<String>>();
				for (int g = 1; g <= k; g++) {
					list.add("[");
					for (int i = 1; i <= 5; i++) {
//						for (int j = 1; j <= 5; j++) {
							num = String.valueOf(random.nextInt(42));
//						}
						list.add(num);
						list.add(",");						
					}
					list.add(String.valueOf(random.nextInt(42)));
					list.add("]");
					list.add("\n");
					mp.put(g, list);
				}
				FileOutputStream ob = new FileOutputStream(filename);
				Iterator<String> it = mp.get(1).iterator();
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
		System.out.println("success");
	}

}
