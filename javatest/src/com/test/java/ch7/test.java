package com.test.java.ch7;

public class test {
	public static void main(String[] args) {
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%dx%d=%d ", i, j, i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int a = 1; a<=9; a++) {
			for(int b = 2; b<=9; b++) {
				System.out.printf("%dx%d=%d ", b, a, b*a);
			}
			
			System.out.println();
		}
	}
}
