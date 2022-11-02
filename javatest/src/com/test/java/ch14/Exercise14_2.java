package com.test.java.ch14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Card{
	Card(String kind, int num){}
}

public class Exercise14_2 {
	public static void main(String[] args) {
		
		Function<String, Integer> x1 = String::length; 
		Function<Integer, int[]> x2 = int[]::new;
		Function<int[], IntStream> x3 = Arrays::stream;
		BiConsumer<String, String> x4 = String::equals;
		BiConsumer<Integer, Integer> x5 = Integer::compare;
		BiFunction<String, Integer, Card> x6 = Card::new;
		Consumer<Integer> x7 = System.out::println;
		Supplier<Double> x8 = Math::random;
		Consumer<String> x9 = String::toUpperCase;
		Supplier<NullPointerException> x10 = NullPointerException::new;
		Consumer<Optional> x11 = Optional::get;
		BiConsumer<StringBuffer, String> x12 = StringBuffer::append;
		Consumer<String> x13 = System.out::println;
		
		
	}
}
