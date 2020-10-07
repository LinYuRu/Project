package week0427;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO_prac01 {

	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("請輸入要壓縮的文件名稱");
//		String fileName = scanner.nextLine();
//		// 要壓縮的物件
//		File fileToZip = new File("D:/Download/" + fileName + ".txt");
		File fileToZip = new File("D:/Download/Lotto.txt");
		FileInputStream src = new FileInputStream(fileToZip);
		// 壓縮檔
		FileOutputStream zipToSave = new FileOutputStream("D:\\Download\\Lotto.zip");
		ZipOutputStream dst = new ZipOutputStream(zipToSave);
		// 檔案裝進壓縮檔
		ZipEntry zipentry = new ZipEntry(fileToZip.getName());
		dst.putNextEntry(zipentry);
		byte[] bytes = new byte[1024];
		int length;
		while ((length = src.read(bytes)) >= 0) {
			dst.write(bytes, 0, length);
		}
		dst.close();
		src.close();
		System.out.println("success");
	}

}
