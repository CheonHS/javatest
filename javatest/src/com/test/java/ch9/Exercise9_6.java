package com.test.java.ch9;

import java.util.*;
import java.util.regex.*;

public class Exercise9_6 {
	public static void main(String[] args) {
		
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
		
		ArrayList list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		 
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim();
			
			if(input.equals("")){
				continue;
			}else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			//=====================		
			
			for(int i=0, listCount=0; i<phoneNumArr.length; i++) {
				for(int j=0; j<phoneNumArr[i].length(); j++) {
					int x = phoneNumArr[i].replace("-", "").indexOf(input);
					if(!(x==-1)) {
//						System.out.println(phoneNumArr[i] + " / ");
//						System.out.println("i : " + i + " / j : " + j);
						list.add(listCount, phoneNumArr[i]);
						listCount++;
						break;
					}
				}
			}
			
			//===================== Pattern, Matcher Class??
//			String patternString = "^\\d{3}-\\d{4}-\\d{4}$";
////			/d  = [0-9] , \\(역스래시) 개수?
//			Pattern pattern = Pattern.compile(patternString);
//		
//			for(int i=0; i<phoneNumArr.length;i++) {
//				Boolean testPattern = Pattern.matches(patternString, phoneNumArr[i]);
//				System.out.println("패턴 매칭[" + i + "] : " + testPattern);
//				
//			}
		
			//=====================
			if(list.size() > 0) {
				System.out.println(list);
				list.clear();
			}else {
				System.out.println("일치하는 번호가 없습니다.");
			}
			
		}
		
	}
}
