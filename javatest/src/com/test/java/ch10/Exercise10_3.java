package com.test.java.ch10;

import java.text.*;
import java.util.*;

public class Exercise10_3 {
	static int paycheeckCount(Calendar from, Calendar to) {
		if(from==null||to==null)
			return 0;
		if(from==to&&from.get(Calendar.DAY_OF_MONTH)==21)
			return 1;
		
		long monDiff = (to.getTimeInMillis() - from.getTimeInMillis())/1000/(60*60*24*28);
//		28일 30일 31일 ???
//		=>	YEAR * 12 + MOTTH = 개월 수 (?)

		if(monDiff<0)
			return 0;
		if(from.get(Calendar.DAY_OF_MONTH)<=21 && to.get(Calendar.DAY_OF_MONTH)>=21)
			monDiff++;
		if(from.get(Calendar.DAY_OF_MONTH)>21 && to.get(Calendar.DAY_OF_MONTH)<21)
			monDiff--;
		
		return (int)monDiff;
	}
	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
		System.out.println(paycheeckCount(from, to));
	}
	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 0, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 21);
		toCal.set(2020, 0, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 1);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 1);
		toCal.set(2020, 2, 23);
		printResult(fromCal, toCal);
		
		fromCal.set(2020, 0, 23);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		
		fromCal.set(2021, 0, 22);
		toCal.set(2020, 2, 21);
		printResult(fromCal, toCal);
		
	}
}
