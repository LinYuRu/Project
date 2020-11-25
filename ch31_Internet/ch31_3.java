package ch31_Internet;

import java.net.MalformedURLException;
import java.net.URL;

public class ch31_3 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://crm.sentinel-global.net/");
			System.out.println("URL 是: " + url.toString());
			System.out.println("protocol 是: " + url.getProtocol());
			System.out.println("Authority 是: " + url.getAuthority());
			System.out.println("file name 是: " + url.getFile());
			System.out.println("host 是: " + url.getHost());
			System.out.println("Path 是: " + url.getPath());
			System.out.println("Port 是: " + url.getPort());
			System.out.println("UserInfo: " + url.getUserInfo());
			System.out.println("DefaultPort 是: " + url.getDefaultPort());
 		} catch (MalformedURLException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
