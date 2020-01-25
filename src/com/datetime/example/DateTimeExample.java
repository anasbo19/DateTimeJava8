package com.datetime.example;

import java.util.Calendar;
import java.util.Date;

public class DateTimeExample {

	public static void main(String[] args) {
		
		System.out.println("----------- JAVA 7 DateTime Operations ---------------");
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
		
	}

}
