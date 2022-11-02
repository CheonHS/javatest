package com.test.java.ch7;

class Ex7_13 {
	class InstanceInner{}
	static class StaticInner{} 
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void StaticMethod() {
		StaticInner obj2 = new StaticInner();
		
//		InstanceInner obj1 = new InstanceInner(); static멤버에서 인스턴스 멤버에 직접접근 불가?
		
		Ex7_13 outer = new Ex7_13();
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	void instanceMethod() {
		
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	
}
