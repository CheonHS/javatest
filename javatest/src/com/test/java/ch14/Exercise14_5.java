package com.test.java.ch14;

import java.util.*;
import java.util.stream.*;


public class Exercise14_5 {
	public static void main(String[] args) {
//		String[] strArr = { "aaa", "bb", "c", "dddd"};
//		int sum=0;
//		for(String i : strArr) {
//			sum+=i.length();
//		}
//		System.out.println("sum=" + sum);
		
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		int sum = Stream.of(strArr).mapToInt(String::length).reduce(0, (a,b)-> a + b);
		System.out.println("sum=" + sum);
	}
}	
