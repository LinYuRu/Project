package TestIOPractice;

import java.io.File;
import java.io.IOException;

public class TestFileProcessEx1 {
	public void main(String[]args) throws IOException {
		File file1 = new File("c:/temp/test/hello.txt");
		if(file1.exists()) {
			System.out.println("Name:"+file1.getName());
			System.out.println("Path:"+file1.getPath());
			System.out.println("Parents:"+file1.getParent());
			System.out.println("Length:"+file1.length());
			file1.delete();
			System.out.println("DELETE!!");
			
		}else {
			file1.createNewFile();
			System.out.println("File create!");
		}
		
	}

}
