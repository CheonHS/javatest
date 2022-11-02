package com.test.java.ch7;

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int ilv = outerIv;
		int ilv2 = outerCv;
	}
	static class StaticInner{
//		int siv - outerIv;
//		static 클래스는 외부 클래스의 인스턴스멤버 접근 불가
		
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;  
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // JDK 1.8부터 에러아님(외부클래스의 지역변수는 final이 붙은 상수만 접근가능)
			int liv4 = LV;
		}
	}
}
public class Ex7_14 {

}
