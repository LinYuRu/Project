package ch22_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class ch22_2 {
	public static void main(String[] args) {
		try {
			FileOutputStream ob = new FileOutputStream("D:\\ch22_2.txt");
			String str = "Taiwan 's NO1!!";
			byte[] bArray = str.getBytes();
			ob.write(bArray);
			ob.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
