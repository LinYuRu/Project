package ch11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Instant_Prac {

	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		Period period = Period.between(LocalDate.of(2020, 10, 1), LocalDate.of(2020, 10, 21));
		System.out.println("年: " + period.getYears());
		System.out.println("月: " + period.getMonths());
		System.out.println("日: " + period.getDays());

		
	}

}
