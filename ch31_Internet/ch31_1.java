package ch31_Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ch31_1 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getLocalHost();
			System.out.println("主機名稱: " + ip.getHostName());
			System.out.println("IP位址: " + ip.getHostAddress());
			System.out.println(ip);
		} catch (UnknownHostException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
