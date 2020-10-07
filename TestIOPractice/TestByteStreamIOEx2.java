package TestIOPractice;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStreamIOEx2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("c:/temp/test/source.txt");
		FileOutputStream fos1 = new FileOutputStream("c:/temp/test/666.txt",true);
		FileInputStream fis2 = new FileInputStream("c:/temp/test/666.txt");
		
		int data;
		while((data=fis1.read())!=-1) {
			System.out.print((char)data+"");
			fos1.write(data);
		}System.out.println();
		int data1;
		while((data1=fis2.read())!=-1) {
			System.out.print((char)data1+"");
		}
		fis2.close();
		fos1.close();
		fis1.close();
	}
	

}


