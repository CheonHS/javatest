package com.test.java.ch9;

public class Exercise9_4 {
	
	static boolean contains(String src, String target) {
			int a = src.indexOf(target);
			if(a!=-1)
				return true;
			
			return false;
			
	}
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
