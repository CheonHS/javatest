package com.test.java.ch6;

class Car6_12{
	String color;
	String gearType;
	int door;
	
	Car6_12() {	}
	Car6_12(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
}
public class Ex6_12 {
	public static void main(String[] args) {
		Car6_12 c1 = new Car6_12();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car6_12 c2 = new Car6_12("white", "auto", 4);	//	단축
		
		System.out.println("c1의 color=" + c1.color + ", geartType="
				+ c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", geartType="
				+ c2.gearType + ", door=" + c2.door);
	}
}
