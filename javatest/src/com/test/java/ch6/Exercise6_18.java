package com.test.java.ch6;

public class Exercise6_18 {
	
	static boolean isNumber(String str){
		System.out.println("str : " + str);
		if(str==null||str=="") {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!('0'<= c && c <='9')) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "123o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = null;
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
	}
}
