package com.test.java.ch14;

import java.util.function.*;

class Exercise14_1 {
	
	public static void main(String[] args) {
		BiConsumer<String, Integer> a = ( name, i) -> System.out.println(name+"="+i);		
		Function<Integer, Integer> b = x -> x * x ;
		Supplier<Integer> c = () -> (int)(Math.random()*6);
		Function<int[], Integer> d = (arr) -> {
			int sum = 0;
			for(int i: arr)
				sum+=i;
			return sum;
		};
		Supplier<int[]> e = () -> new int[]{};
		
		
		a.accept("123", 123);
		System.out.println(b.apply(5));
		System.out.println(c.get());
		int[] x = {1,2,3,4,5};
		System.out.println(d.apply(x));
		System.out.println(e);
	}
	
}
