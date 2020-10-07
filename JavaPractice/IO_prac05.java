package JavaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO_prac05 {

	public static void main(String[] args) throws IOException {
		ArrayList srcFiles = new ArrayList();
		String p = "D:\\Download\\Lotto_";
		for (int i = 0; i <= 20; i++) {
			String num = Integer.toString(i);
			String filename = p + num + ".txt";
			srcFiles.add(filename);
		}

		FileOutputStream zipToSave = new FileOutputStream("D:\\ch23_2.zip");
		ZipOutputStream dst = new ZipOutputStream(zipToSave);
		
		for(int j=1;j<=20;j++) {
			String[] srcFile = new String[21];
//			System.out.println(srcFiles.get(j));
			srcFile[j] = (String) srcFiles.get(j);
			
//			System.out.println(j);
			File fileToZip = new File(srcFile[j]);
			FileInputStream src = new FileInputStream(fileToZip);
			
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			dst.putNextEntry(zipEntry);

			byte[] bytes = new byte[1024]; 
			int length; 
			while ((length = src.read(bytes)) >= 0) {
				dst.write(bytes, 0, length); 
			}
			src.close(); 
		}
		dst.close(); 

	}

}
