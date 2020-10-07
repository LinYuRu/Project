package week0427;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class IO_prac03 {
	private static void zipFile(File fileToZip, String fileName, ZipOutputStream dst) throws IOException {
		if (fileToZip.isHidden()) {
			return;
		}
		if (fileToZip.isDirectory()) {
			File[] files = fileToZip.listFiles();
			for (File file : files) {
				zipFile(file, fileName + "/" + file.getName(), dst);
			}
			return;
		}
		FileInputStream src = new FileInputStream(fileToZip);
		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		dst.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;
		while ((length = src.read(bytes)) >= 0) {
			dst.write(bytes, 0, length);
		}
		src.close();
		System.out.println("success");

	}

	public static void main(String[] args) throws IOException {
		File fileToZip = new File("D:/Download/Lotto");

		FileOutputStream zipToSave = new FileOutputStream("D:/Download/Lotto.zip");
		ZipOutputStream dst = new ZipOutputStream(zipToSave);
		zipFile(fileToZip, fileToZip.getName(), dst);
		dst.close();
	}

}
