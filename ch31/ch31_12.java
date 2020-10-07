package ch31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class ch31_12 {
	public static void main(String[] args) {
		String hostname = "localhost";
		int port = 2255;
		try {
			Socket socket = new Socket(hostname, port);
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line = reader.readLine();
			System.out.println(line);
		} catch (UnknownHostException e) {
			System.out.println("找不到server: " + e.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O錯誤: " + ex.getMessage());
		}
		
	} 
}
