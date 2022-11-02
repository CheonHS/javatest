package com.test.java.ch14;

import java.util.Arrays;
import java.util.stream.*;

public class Exercise14_4 {
	public static void main(String[] args) {
		
//		int [] x = {1,2,3,4,5,6};
//		for(int i : x) {
//			for(int j : x) {
//				if((i+j)==6)
//					System.out.println("["+ i + ", " + j + "]");
//			}
//		}
		/*IntStream.rangeClosed(1, 6).forEach(x->
			IntStream.rangeClosed(1, 6).forEach(y-> {
					if((x+y)==6)
						System.out.println("[" + x + ", " + y + "]");
				}
			)
		);*/
		
		Stream<Integer> dice = IntStream.rangeClosed(1, 6).boxed();
		
		dice.flatMap(i -> IntStream.rangeClosed(1, 6).boxed().map(i2 -> new int[] {i, i2}))
			.filter(arr -> arr[0] + arr[1] == 6)
			.forEach(arr -> System.out.println(Arrays.toString(arr)));
	}
}
