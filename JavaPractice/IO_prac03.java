package JavaPractice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class IO_prac03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入查詢行數");
		int LineNumber = scanner.nextInt();
		FileReader in = null;
		LineNumberReader reader = null;
		try {

			in = new FileReader(new File("D:\\download\\Lotto.txt"));
			reader = new LineNumberReader(in);
			String s = "";
			int lines = 0;
			while (s != null) {
				lines++;
				s = reader.readLine();
				if ((lines - LineNumber) == 0) {
					System.out.println(s);
					System.exit(0);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
