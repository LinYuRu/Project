package ch31;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ch31_4 {

	public static void main(String[] args) {
//		"http://aaa.24ht.com.tw/ch31Chinese.txt"
		String str;
		try {
			URL url = new URL("http://aaa.24ht.com.tw/ch31Chinese.txt");
			URLConnection uc = url.openConnection();//return connection instance
			InputStream stream = uc.getInputStream();//return a input stream from this open connection
			int i;
			while((i=stream.read())!=-1)
				System.out.println(i);
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		

	}

}
