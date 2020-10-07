package interface_Prac;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(sdFormat.format(date));
		System.out.println(date.toString());
		String now = "2020-04-15";
		try {
			date = sdFormat.parse(now);
			System.out.println("Date: " + date);
			System.out.println("Date.toString: " + date.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
