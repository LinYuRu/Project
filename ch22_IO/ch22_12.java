package ch22_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ch22_12 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("ch22_11.txt");
		BufferedReader br = new BufferedReader(fr);
		int i;
		while (( i = br.read()) != -1)
			System.out.print((char)i);
		fr.close();
		br.close();

	}

}
