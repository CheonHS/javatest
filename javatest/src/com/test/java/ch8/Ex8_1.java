package com.test.java.ch8;

public class Ex8_1 {
	public static void main(String args[]) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {		//예외가 없으면 실행X
			System.out.println(4);
		}
		System.out.println(5);
	}
}
