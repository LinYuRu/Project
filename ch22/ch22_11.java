package ch22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ch22_11 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("ch22_11.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		String str = "Welcome everyone";
		bw.write(str, 0, 6);
		bw.newLine();
		bw.write(str, 6, str.length()-6);
		bw.close();
		System.out.println("輸出成功");

	}

}
