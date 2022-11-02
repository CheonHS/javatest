package com.test.java.ch6;

class PlayingCard{
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}
public class Exercise6_5 {
//	- 클래스 변수 (static변수) :
	
//		static int width
//		static int height
//	 	
//	- 인스턴스 변수 : 
	
//		PlayingCard card 
	
//	- 지역 변수 : 
//		int kind;
//		int num;
//		int k
//		int n
}
