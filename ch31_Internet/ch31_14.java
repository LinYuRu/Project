package ch31_Internet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ch31_14 {

	public static void main(String[] args) throws Exception {
//		Scanner scanner = new Scanner(System.in);
//		int port = 2255;
//		if(args.length < 1) {
//			System.out.println("請輸入ip");
//			return;
//		}
		int port = 2255;
		String receiveIP = "192.168.0.110";//設定IP
		InetAddress addr = InetAddress.getByName(receiveIP);
		while(true) {
			System.out.println("訴說心聲: ");
			InputStreamReader ir = new InputStreamReader(System.in);
//			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String txt = br.readLine();
			int txtLength = txt.length();
			byte[] buf = new byte[txtLength];//依長度建立byte陣列
			buf = txt.getBytes();//將讀取訊息存進陣列
			DatagramPacket datagram = new DatagramPacket(buf,txtLength,addr,port);
			DatagramSocket socket = new DatagramSocket();
			if(txt.equalsIgnoreCase("quit")) 
				break;
			socket.send(datagram);
			socket.close();
			
			}

	}

}
