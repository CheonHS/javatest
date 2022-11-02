package com.test.java.ch10;

import java.text.*;
import java.util.*;

public class Exercise10_4 {
	public static void main(String[] args) {
		Calendar birthday = Calendar.getInstance();
		birthday.set(2000, 0, 1);
		Calendar today = Calendar.getInstance();
//		today.set(2016, 0, 29);
		Date birthdayDate =  birthday.getTime();
		Date todayDate =  today.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		long days = (today.getTimeInMillis() - birthday.getTimeInMillis())/1000/(60*60*24);
		
		System.out.println(sdf.format(birthdayDate));
		System.out.println(sdf.format(todayDate));
		System.out.println(days + " days");

	}
}
