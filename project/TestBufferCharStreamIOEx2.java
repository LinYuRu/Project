package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferCharStreamIOEx2 {

	public static void main(String[] args) throws IOException {
//		FileReader fr1 = new FileReader("c:/temp/test/secrect.txt");
//		BufferedReader br1 = new BufferedReader();
		
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/secrect.txt"));
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("c:/temp/test/keepsecrect.txt"));
		
		String data;
		while((data = br1.readLine())!=null) {
			System.out.println(data);
			bw1.write(data);
			bw1.newLine();
		}bw1.flush();
		bw1.close();
		
		
		br1.close();
		
		

	}

}
