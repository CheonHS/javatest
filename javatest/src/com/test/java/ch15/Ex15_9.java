package com.test.java.ch15;

import java.io.*;

public class Ex15_9 {
	public static void main(String args[]) {
		try {
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1]);
			
			int data = 0;
			while((data=fr.read()) != -1) {
				if(data!='\t' && data!=' ' && data!='\r' && data != '\n')
					fw.write(data);
			}
			fr.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
