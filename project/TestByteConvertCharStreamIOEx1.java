package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestByteConvertCharStreamIOEx1 {

	public static void main(String[] args) throws IOException {
//		InputStream is1 = System.in;
//		InputStreamReader isr1 = new InputStreamReader(is1);
//		BufferedReader br1 = new BufferedReader(isr1);
		System.out.println("Please enter your name(Use Q or q to exit)");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
//		FileOutputStream os1= new FileOutputStream("c:/temp/test/busyDayRecord.txt");
//		OutputStreamWriter osw1 = new OutputStreamWriter(os1);
//		BufferedWriter bw1 = new BufferedWriter(osw1);
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/temp/test/busyDayRecord.txt")));
		
		String data;
		while((data=br1.readLine())!=null) {
			if(data.equalsIgnoreCase("Q")) {
				System.out.println("See You");
			}System.out.println(data);
			
			bw1.write(data);
			bw1.newLine();
		}bw1.flush();
		bw1.close();
		br1.close();
		
		
		
	}

}
