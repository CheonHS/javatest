package com.test.java.ch7;

class Outer7_8{
	int value = 10;
	
	class Inner{
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(
			//----------------
					value
			//----------------
			);
			System.out.println(
			//----------------
					this.value
			//----------------
			);
			System.out.println(
			//----------------
					Outer7_8.this.value
			//----------------
			);
		}
	}
}
public class Exercise7_8 {
	public static void main(String args[]) {
		//----------------
		Outer7_8 outer = new Outer7_8();
		Outer7_8.Inner inner = outer.new Inner();
		//----------------
		inner.method1();
	}
}
