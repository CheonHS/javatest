package com.test.java.ch7;

class Ex7_12 {
	class IntanceInner {
		int iv = 100;
//		static int cv = 100; error / static 클래스 아니므로 선언x
		final static int CONST = 100; // 상수라서 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;	// static class 라서 가능
	}
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(IntanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
