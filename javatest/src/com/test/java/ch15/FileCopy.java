package com.test.java.ch15;

import java.io.*;

public class FileCopy {
	public static void main(String args[]) {
		try {
//			FileInputStream fis = new FileInputStream(args[0]);
//			FileOutputStream fos = new FileOutputStream(args[1]);
			
			FileInputStream fis = new FileInputStream(".\\src\\com\\test\\java\\ch15\\FileCopy.java");
			FileOutputStream fos = new FileOutputStream(".\\src\\com\\test\\java\\ch15\\FileCopy.bak");
			
//			System.out.println(fis);
//			System.out.println(fos);
			
			int data = 0;
			while((data=fis.read())!=-1)
				fos.write(data);
			fis.close();
			fos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
