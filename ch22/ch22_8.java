package ch22;

import java.io.FileWriter;
import java.io.IOException;

public class ch22_8 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("ch22_8.txt");
			String str = "Taiwan 's NO1!!";
			fw.write(str);
			fw.close();
			System.out.println("success");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
