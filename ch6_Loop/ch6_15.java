package ch6_Loop;

import java.util.Scanner;

public class ch6_15 {
	public static void main(String[] args) {
		String msg, msg1, msg2, input_msg;
		char again;
		Scanner scanner = new Scanner(System.in);
		msg1 = "人機對話專欄,告訴我心事吧,我會重覆告訴你我的心事!";
		msg2 = "輸入q可以結束對話 = ";
		msg = msg1 + '\n' + msg2;
		again = ' ';
		
		while( again != 'q') {
			System.out.print(msg);
			input_msg = scanner.next();
			System.out.println(input_msg);
			again = input_msg.charAt(0);
		}
	}
}
