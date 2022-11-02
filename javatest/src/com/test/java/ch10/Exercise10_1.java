package com.test.java.ch10;

import java.text.*;
import java.util.*;

public class Exercise10_1 {
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일 입니다.");
		
		Calendar start = Calendar.getInstance();
		start.set(2020, 0, 1);

		
		while(start.get(Calendar.YEAR)==2020) {
			int x = start.get(Calendar.DAY_OF_WEEK);
			int y = start.get(Calendar.DAY_OF_WEEK_IN_MONTH);

			if(x==1&&y==2) {
				date = start.getTime();
				System.out.println(sf.format(date));
			}
			start.add(Calendar.DATE, 1);
		}

	}
}
