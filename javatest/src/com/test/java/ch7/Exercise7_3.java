package com.test.java.ch7;

class Product3{
	int price;
	int bonusPoint;
	
// 생성자
	//Product3(){}
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv3 extends Product3{
	
//	error
	Tv3() {
		super(500);
	}

	public String toString() {
		return "Tv";
	}
	
}
class Exercise7_3 {
	public static void main(String[] args) {
		Tv3 t = new Tv3();
	}
}
