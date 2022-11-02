package com.test.java.ch14;

import java.util.*;
import java.util.stream.*;

public class Exercise14_7 {
	public static void main(String[] args) {
//		Set num = new TreeSet();
//		
//		for(int i = 0; num.size()<6; i++) {
//			num.add((int)(Math.random()*45) + 1);
//		}
//		Iterator x = num.iterator();
//		while(x.hasNext()) {
//			System.out.println(x.next());
//		}
		
		IntStream num = new Random().ints(1,46).distinct().limit(6).sorted();
		num.forEach(System.out::println);
	}
}
