package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/source.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/dest.txt", true);
		FileInputStream fis2 = new FileInputStream("c:/temp/test/dest.txt");
		
		int data1;
		while((data1=fis1.read())!=-1) {
			System.out.print((char)data1+"");
			fos1.write(data1);
		}
		int data2;
		while((data2=fis2.read())!=-1) {
			System.out.print((char)data2+"");
		}
		fis2.close();
		fos1.close();
		fis1.close();
		

	}

}
