package ch31;

import java.net.HttpURLConnection;
import java.net.URL;

public class ch31_9 {

	public static void main(String[] args) {
		String str;
		try {
			URL url = new URL("http://aaa.24ht.com.tw/");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			for(int i=1;i<=8;i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
