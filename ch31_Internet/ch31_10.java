package ch31_Internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ch31_10 {

	public static void main(String[] args) {
		String outstr = "sentinel-global.net";
		String hostname = "whois.internic.net";
		int port = 43;
		Socket socket;
		try {
			//建立連線
			socket = new Socket(hostname, port);
			//傳送資料給server
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			writer.println(outstr);
			//取得server端資料
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (UnknownHostException ex) {
			System.out.println("找不到server : " + ex.getMessage());
			ex.printStackTrace();
		} catch (IOException e) {
			System.out.println("I/O錯誤: " + e.getMessage());
		}
		

	}

}
