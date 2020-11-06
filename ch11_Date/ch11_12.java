package ch11_Date;
import java.time.*;
public class ch11_12 {
	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.of(2020, 2, 10, 11, 30);
		System.out.println("�s������ɶ� : " + datetime);
		datetime = LocalDateTime.of(2020, 2, 10, 11, 40, 30);
		System.out.println("�s������ɶ� : " + datetime);
		datetime = LocalDateTime.of(2020, 2, 10, 11, 50, 30, 300000000);
		System.out.println("�s������ɶ� : " + datetime);
	}
}

