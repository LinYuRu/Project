package ch31_Internet;

import java.io.*;
import java.net.*;

public class ch31_6 {

	public static void main(String[] args) {
		String str;
		try {
			URL url = new URL("http://aaa.24ht.com.tw/");
			URLConnection uc = url.openConnection();
			URLConnection ux = url.getUserInfo();
			InputStream is = uc.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
//			URLConnection uc = url.openConnection();
//			InputStream stream = uc.getInputStream();
//			InputStreamReader isr = new InputStreamReader(stream);
//			BufferedReader br = new BufferedReader(isr);
//			while((str=br.readLine())!=null)
//				System.out.println(str);
//			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
