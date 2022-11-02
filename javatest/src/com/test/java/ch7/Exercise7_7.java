package com.test.java.ch7;

class Outer7_7{
	static class Inner{
		int iv = 200;
	}
}
public class Exercise7_7 {
	public static void main(String[] args) {
		//------------------------------------------
		Outer7_7.Inner x = new Outer7_7.Inner();
		System.out.println(x.iv);
		
		//------------------------------------------
	}
}
