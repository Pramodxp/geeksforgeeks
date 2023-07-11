package com.gfg.leetcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateCals {
	public static void main(String[] args) throws ParseException {
		calDate();
	}
	private static void calDate() throws ParseException {
		Period diff = Period.between(
	            LocalDate.parse("2022-12-19").withDayOfMonth(1),
	            LocalDate.parse("2023-12-19").withDayOfMonth(1));
	System.out.println(diff); //P3M
	System.out.println(diff.getMonths()); //P3M
	
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	Date firstDate = sdf.parse("12/19/2022");
    Date secondDate = sdf.parse("12/19/2023");
    
    LocalDate convertedDate = LocalDate.parse("12/19/2022", DateTimeFormatter.ofPattern("M/d/yyyy"));
    convertedDate = convertedDate.withDayOfMonth(
                                    convertedDate.getMonth().length(convertedDate.isLeapYear()));

    //add date
    Date date = Date.from(convertedDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    //adding the date
    System.out.println("year :"+c.MONTH);
    c.add(Calendar.DATE, 1);
    date =  c.getTime();
    
    System.out.println("string date :"+sdf.format(date));
    System.out.println("year :"+c.YEAR);
    
    System.out.println("incremented date is : "+date);
    
    System.out.println("last date "+convertedDate);
    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
    long diff1 = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    System.out.println(diff1);
	}
	
}

