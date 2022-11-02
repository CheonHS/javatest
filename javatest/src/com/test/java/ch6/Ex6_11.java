package com.test.java.ch6;

class Data_1{	// 생성자가 없다 -> 기본 생성자 자동 추가
	int value;
}
class Data_2{	// 생성자가 있다 -> 1. 생성자에 맞는 매개변수 필요
	int value;
	
	Data_2(){	// 2. 매개변수가 필요없는 생성자 추가
	
	}
	
	Data_2(int x){
		value = x;
	}
}
public class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
	}
}
