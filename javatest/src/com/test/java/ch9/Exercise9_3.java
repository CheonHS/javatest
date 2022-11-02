package com.test.java.ch9;

public class Exercise9_3 {
	
	public static int count(String src, String target) {
		int pos = 0;
		int count = 0;
		while ((pos=src.indexOf(target, pos)) != -1) {
			count++;
			pos += target.length();
		}
		
		return count;
		
		/*int count = 0;
		int pos = 0;
		//-------------------
		while(pos<src.length()) {
			int a = src.indexOf(target, pos);
			if(!(a==-1)) {
				count++;
				pos+=a;
				continue;
			}else {
				break;
			}	
		}
		return count;*/
		//-------------------
	}
	
	public static void main(String[] ars) {
		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));
		System.out.println(count("AB12345ABADFASDAB", "AB"));
//		System.out.println(count("12345AB123AB123A123ABAB", "AB"));
	}
}
