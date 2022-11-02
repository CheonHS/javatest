package com.test.java.ch14;

import java.util.*;
import java.util.stream.*;

public class Exercise14_6 {
	public static void main(String[] args) {
//		String[] strArr = { "aaa", "bb", "c", "dddd" };
//		
//		int max = 0;
//		for(int i=1; i<strArr.length; i++) {
//			int a = strArr[i].length();
//			int b = strArr[i-1].length();
//			max = a>b ? a:b;
//		}
//		System.out.println(max);
		
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		int x = Stream.of(strArr).mapToInt(String::length).reduce(0, (a,b)-> a > b? a:b);
		System.out.println(x);
	}
}
