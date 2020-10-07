package MidTermEx1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MidTermIOEX {

	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(
				new FileReader("C:\\Users\\User\\Desktop\\MidTerm\\ExchangeRate\\ER.txt"));
		BufferedWriter bw1 = new BufferedWriter(
				new FileWriter("C:\\Users\\User\\Desktop\\MidTerm\\ExchangeRate\\keepsecret.xls"));

		String data;
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
		}
		bw1.flush();
		bw1.close();
		br1.close();
	}

}