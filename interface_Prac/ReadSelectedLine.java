package interface_Prac;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadSelectedLine {
	static void readAppointedLineNumber(File sourceFile, int lineNumber) throws IOException {
		FileReader in = new FileReader(sourceFile);
		LineNumberReader reader = new LineNumberReader(in);
		String s = "";
		if (lineNumber <= 0 || lineNumber > getTotalLines(sourceFile)) {
			System.out.println("不在檔案的行數範圍(1至總行數)之內。");
			System.exit(0);
		}
		int lines = 0;
		while (s != null) {
			lines++;
			s = reader.readLine();
			if ((lines - lineNumber) == 0) {
				System.out.println(s);
				System.exit(0);
			}
		}
		reader.close();
		in.close();
	}

	// 檔案內容的總行數。
	static int getTotalLines(File file) throws IOException {
		FileReader in = new FileReader(file);
		LineNumberReader reader = new LineNumberReader(in);
		String s = "";
		int lines = 0;
		while (s != null) {
			lines++;
			s = reader.readLine();
		}
		reader.close();
		in.close();
		return lines;
	}

	/**
	 * 讀取檔案指定行。
	 */
	public static void main(String[] args) throws IOException {
		// 指定讀取的行號
		int lineNumber = 2;
		// 讀取檔案
		File sourceFile = new File("D:/Lotto.txt");
		// 讀取指定的行
		readAppointedLineNumber(sourceFile, lineNumber);
		// 獲取檔案的內容的總行數
		System.out.println(getTotalLines(sourceFile));
	}
}
