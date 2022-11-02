package com.test.java.ch7;

class Outer3{
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void metohd1() {
			int value = 30;
			System.out.println("            value : " + value);	//	메서드 지역 변수
			System.out.println("       this.value : " + this.value);//	인스턴스 변수
			System.out.println("Outer3.this.value : " + Outer3.this.value);	//	외부 인스턴스 변수
			
		}
	}
}
public class Ex7_16 {
	public static void main(String args[]) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.metohd1();
	}
}
