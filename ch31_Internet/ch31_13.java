package ch31_Internet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ch31_13 {

	public static void main(String[] args) throws Exception {
		int port = 2255;
		byte[] buf = new byte[1024];
		System.out.println("接收端程式執行中...");
		while(true) {
			DatagramSocket socket = new DatagramSocket(port);
			DatagramPacket data = new DatagramPacket(buf,buf.length);
			socket.receive(data);
			String msg = new String(buf, 0, data.getLength());
			System.out.println("傳來的訊息: " + msg);
			socket.close();
		}

	}

}
