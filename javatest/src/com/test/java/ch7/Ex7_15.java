package com.test.java.ch7;

class Outer2{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}
class Ex7_15 {
	public static void main(String[] args) {
		
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();
//		인스턴스클래스의 인스턴스 생성시 외부 클래스 인서턴스 필요
		
		System.out.println("il.iv : "+ ii.iv);
		System.out.println("Outer2.StaticInner.cv :" + Outer2.StaticInner.cv);
		
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : "+ si.iv);
//		static 내부클래스의 인스턴스는 외부클래스 먼저 생성하지 않아도 된다.
	}
}
