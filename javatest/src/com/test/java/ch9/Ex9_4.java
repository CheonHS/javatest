package com.test.java.ch9;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
}
public class Ex9_4 {
	public static void main(String[] arhs) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
//		클래스이름, 해시코드 값
	}
}
