package JavaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Collection_prac03 {

	public static void main(String[] args) throws IOException {

		String pattern = "ABCDEFGHJKLMNPQRSTUVWXYZIO";

		Random r = new Random();
		String s = "";
		int checknum = 0;	// 尾號驗證碼

		// 產生第一個英文字母
		int t=(r.nextInt(26)+65);
		System.out.println(t);
		s+=(char)t;
		System.out.println("英文字母: "+s);
		t=pattern.indexOf((char)t)+10;
		checknum += t/10;
		checknum += t%10*9;

		// 第2個數字 (1~2)
		s += Integer.toString(t = r.nextInt(2)+1);
		System.out.println("第2個數字 "+s);
		checknum += t*8;

		// 到第8碼
//		for (int i=2; i<=8; i++){
//			s += Integer.toString(t = r.nextInt(10));
//			checknum += t*(9-i);
//		}
		for (int i=2; i<9; i++){
			s += Integer.toString(t = r.nextInt(10));
			checknum += t*(9-i);
		}
		checknum = (10-((checknum)%10))%10;
		s+=Integer.toString(checknum);
		System.out.println(s);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////		Scanner scanner = new Scanner(System.in);
//		String getbr, a = "";
//		Random r = new Random();
//		int b, i, c;
//		while (true) {
//			System.out.print("請選擇性別 1.男 2.女");
//
//			getbr = br.readLine();
//			while (true) {
//				b = r.nextInt(26) + 10;
//				switch (b) {
//				case 10:
//					a = "A";
//				case 11:
//					a = "B";
//				case 12:
//					a = "C";
//				case 13:
//					a = "D";
//				case 14:
//					a = "E";
//				case 15:
//					a = "F";
//				case 16:
//					a = "G";
//				case 17:
//					a = "H";
//				case 34:
//					a = "I";
//				case 18:
//					a = "J";
//				case 19:
//					a = "K";
//				case 20:
//					a = "L";
//				case 21:
//					a = "M";
//				case 22:
//					a = "N";
//				case 35:
//					a = "O";
//				case 23:
//					a = "P";
//				case 24:
//					a = "Q";
//				case 25:
//					a = "R";
//				case 26:
//					a = "S";
//				case 27:
//					a = "T";
//				case 28:
//					a = "U";
//				case 29:
//					a = "V";
//				case 32:
//					a = "W";
//				case 30:
//					a = "X";
//				case 31:
//					a = "Y";
//				case 33:
//					a = "P";
//				}
//
//				b = (b % 10) * 9 + b / 10;
//				c = b;
//				if (getbr.equals("1")) {
//					a = a + "1";
//				} else if (getbr.equals("2")) {
//					a = a + "2";
//				}
//				for (i = 0; i < 8; i = i + 1) {
//					b = r.nextInt(10);
//					a = a + b;
//				}
//				
//				b = c;
//				for (i = 1; i < 9; i++) {
//					b = b + (a.charAt(i) - '0') * (9 - i);
//				}
//				
//				b = (10 - b % 10) % 10;
//				if (a.charAt(9) - '0' == b) {
//					System.out.println(a);
//					System.out.println("正確");
//					break;
//				} else {
//					continue;
//				}
//			}
//			System.out.print("是否繼續 1.繼續 0.結束");
//			getbr = br.readLine();
//			if (getbr.equals("0")) {
//				return;
//			} else {
//				continue;
//			}
//
//		}

	}

}
