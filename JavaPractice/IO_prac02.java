package JavaPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IO_prac02 {

	public static void main(String[] args) {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd");
		Date current = new Date();
		String str = sdFormat.format(current);
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader("D:\\download\\Lotto.txt"));
			bw = new BufferedWriter(new FileWriter("D:\\download\\Lotto_" + str + ".txt"));

			String data;
			while ((data = br.readLine()) != null) {
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			System.out.println("輸出成功");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
