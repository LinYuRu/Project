package ch11_Date;
import java.time.*;
public class ch11_11 {
	public static void main(String[] args) {
		int year, month, monthValue, dayofWeek, dayofMonth, dayofYear;
		LocalDateTime today = LocalDateTime.now();
		System.out.println("�{�b��� : " + today);
		System.out.println("    �~�� : " + today.getYear());
		System.out.println("�^���� : " + today.getMonth());
		System.out.println("    ��� : " + today.getMonthValue());
		System.out.println("�^��P�� : " + today.getDayOfWeek());
		System.out.println("����� : " + today.getDayOfMonth());
		System.out.println("��~��� : " + today.getDayOfYear());
		System.out.println("      �� : " + today.getHour());
		System.out.println("      �� : " + today.getMinute());
		System.out.println("      �� : " + today.getSecond());
		System.out.println("    �`�� : " + today.getNano());
	}
}

