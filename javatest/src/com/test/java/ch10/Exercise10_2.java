package com.test.java.ch10;

import java.text.*;
import java.util.*;

public class Exercise10_2 {
	public static void main(String[] args) {
	
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sf2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
		
		Scanner sc = new Scanner(System.in);
		Date day = null;

		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2017/05/11)");
		while(sc.hasNextLine()){
			
			try {
				day = sf1.parse(sc.nextLine());
				System.out.println(sf2.format(day));
				break;
			}catch (Exception e) {
				System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2017/05/11)");
			}
		}
		
	}
	
}
