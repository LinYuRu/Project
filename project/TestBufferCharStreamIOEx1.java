package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
//		FileReader fr1 = new FileReader("c:/temp/test/secrect.txt");
//		BufferedReader br1 = new BufferedReader();
		
		BufferedReader br1 = new BufferedReader(new FileReader("c:/temp/test/secrect.txt"));
		
		String data;
		while((data = br1.readLine())!=null) {
			System.out.println(data);
		}br1.close();
		
		

	}

}
