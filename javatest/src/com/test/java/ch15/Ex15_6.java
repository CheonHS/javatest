package com.test.java.ch15;

import java.io.*;

public class Ex15_6 {
	public static void main(String args[]) {
		try {
//			FileOutputStream fos = new FileOutputStream("123.txt");
			FileOutputStream fos = new FileOutputStream(".\\src\\com\\test\\java\\ch15\\123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			

			for(int i='1'; i <='9'; i++) {
				bos.write(i);
			}
			
			bos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
