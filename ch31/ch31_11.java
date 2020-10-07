package ch31;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ch31_11 {

	public static void main(String[] args) {
		int port = 2255;
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Server服務程式正在傾聽port " + port);
			while(true) {
				Socket socket = serverSocket.accept();
				System.out.println("server與client端連線成功");
				OutputStream output = socket.getOutputStream();
				PrintWriter writer = new PrintWriter(output, true);
				writer.println("現在日期" + new Date().toString());
			}
		} catch (IOException e) {
			System.out.println("I/O錯誤: "+e.getMessage());
		}


	}

}
