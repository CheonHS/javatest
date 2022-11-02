package com.test.java.ch9;

public class Ex9_14 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		// 래퍼클래스 : 기본형 변수를 객체로 다룰때 사용
		// 래퍼 클래스 모두 equals가 주소값이 아닌 객체가 가진 값을 비교하게끔 오버라이딩 되어있다. 
		
		System.out.println("i==i2 ? " + (i==i2));
		System.out.println("i.equals(i2) ? " + i.equals(i2));
		System.out.println("i.compareTo(i2)=" + i.compareTo(i2));
		System.out.println("i.toString()=" + i.toString());
		
		System.out.println("MAX_VALUE-" + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE-" + Integer.MIN_VALUE);
		System.out.println("SIZE=" + Integer.SIZE + " bits");
		System.out.println("BYTES=" + Integer.BYTES + " bytes");
		System.out.println("TYPE=" + Integer.TYPE);
	}
}
