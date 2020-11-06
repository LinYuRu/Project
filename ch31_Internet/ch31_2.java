package ch31_Internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ch31_2 {

	public static void main(String[] args) {
		InetAddress ip;
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.facebook.com");
			ip = InetAddress.getByName("www.facebook.com");
			System.out.println("Facebook IP: " + ip);
			for(InetAddress g:ips)
			System.out.println("ips: "+g);
		} catch (UnknownHostException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
