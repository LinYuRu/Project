package week0427;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO_prac02 {

	public static void main(String[] args) throws IOException {
		String[] srcFiles = { "D:/Download/Lotto_1.txt", "D:/Download/Lotto_2.txt" };

		FileOutputStream zipToSave = new FileOutputStream("D:/Download/Lotto_peac01.zip");
		ZipOutputStream dst = new ZipOutputStream(zipToSave);
		for (String srcFile : srcFiles) {
			File fileToZip = new File(srcFile);
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
		System.out.println("success");
	}

}
