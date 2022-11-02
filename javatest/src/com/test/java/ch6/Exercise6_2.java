package com.test.java.ch6;

public class Exercise6_2 {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String s1 = s.info();
		System.out.println(s1);
	}
}