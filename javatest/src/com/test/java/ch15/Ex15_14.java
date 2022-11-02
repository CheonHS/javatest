package com.test.java.ch15;

import java.io.*;

public class Ex15_14 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
//			fos = new FileOutputStream("test.txt");
			fos = new FileOutputStream(".\\src\\com\\test\\java\\ch15\\test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps);
		}catch (FileNotFoundException e) {
			System.err.println("Fill not found.");
		}
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
		
	}
}
