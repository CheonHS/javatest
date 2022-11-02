package com.test.java.ch7;

class Outer7_6{
	class Inner{
		int  iv = 100;
	}
}
public class Exercise7_6 {
	public static void main(String[] args) {
		//------------------------------------------
		
		
		Outer7_6 outer = new Outer7_6();
		Outer7_6.Inner x = outer.new Inner();
		
		System.out.println(x.iv);
		
		
		//------------------------------------------
	}
}
