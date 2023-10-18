package com.project.example.oops;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateRefactoring {
	public static final String test = "1000";

	public static void main(String[] args) throws ParseException {

		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.toString().replace("-", ""));

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.toString().substring(0, 5).replace(":", ""));

		// String s1=date"\"R\" +time;
		char ch = '"';
		String s = "<time=\"serviceCode\" value=" + ch + date + ch + "/>\r\n";

		System.out.println(s);

	}
}
