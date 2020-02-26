package com.datetime.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		
		System.out.println("----------- JAVA 7 DateTime Operations ---------------");
		System.out.println("______________________________________________________");
		System.out.println("Creating an object with current date and time : ");
		Date currentDateJava7= new Date();
		System.out.println(currentDateJava7);
		System.out.println("--------------------------------------------------");
		
		System.out.println("Creating an object representing 25 January 2020 : ");
		Calendar c = Calendar.getInstance();
		c.set(2020, Calendar.JANUARY, 25, 0, 0, 0);
		Date jan252020Java7 = c.getTime();
		System.out.println(jan252020Java7);
		System.out.println("--------------------------------------------------");
		
		System.out.println("----------- JAVA 8 DateTime Operations ---------------");
		System.out.println("______________________________________________________");
		System.out.println("Creating an object with current date : ");
		LocalDate currentDateJava8 = LocalDate.now();
		System.out.println(currentDateJava8);
		System.out.println("--------------------------------------------------");
		
		System.out.println("Creating an object with current date and time : ");
		LocalDateTime currentDateTimeJava8 = LocalDateTime.now();
		System.out.println(currentDateTimeJava8);
		
		System.out.println("Creating an object representing 25 January 2020 : ");
		LocalDate jan202025Java8 = LocalDate.of(2020, Month.JANUARY, 25);
		System.out.println(jan202025Java8);
		
		/* date and time classes are immutable like String class
		 * so when using date time methods, we need to assign the results to a reference variable
		 */
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println("date : " + date);
		System.out.println("// adding 2 days to date");
		// adding two days to date, and assign the reference of the new object created to date variable
		date = date.plusDays(2);
		System.out.println(date);
		System.out.println("// adding one week to date");
		date = date.plusWeeks(1);
		System.out.println(date);
		System.out.println("// adding one month to date");
		/* 
		 * java knows that 2020 is a leap year, so when adding one month to 2020-01-29 it returns 2020-02-29, 
		 * in case of 2021(not a leap year), it will return 2021-02-28
		 */
		date = date.plusMonths(1);
		System.out.println(date);
		System.out.println("// adding 3 years to date");
		date = date.plusYears(3);
		System.out.println(date);
		
		System.out.println("// extracting informations from a date without DateTimeFormatter : ");
		LocalDate date26022020 = LocalDate.of(2020, Month.FEBRUARY, 26);
		System.out.println("------------------------------------------");
		System.out.println("Date is 26/02/2020");
		System.out.println("Day of week : " + date26022020.getDayOfWeek());
		System.out.println("Month : " + date26022020.getMonth());
		System.out.println("Year : " + date26022020.getYear());
		System.out.println("Day of year : " + date26022020.getDayOfYear());
		
		System.out.println("// Formatting a DateTime with a specific pattern");
		LocalDateTime dateTime = LocalDateTime.of(date26022020, LocalTime.of(21, 06));
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(formatter));
		
		System.out.println("// Parsing a Date with specific pattern : ");
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalTime time = LocalTime.parse("22:01");
		System.out.println(date26022020);
		System.out.println(time);
		
	}

}
