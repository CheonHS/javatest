package com.test.java.ch15;

import java.io.*;

// Exercise15_1
public class FileHead {
	public static void main(String[] args) {
		
		try {
			int line = Integer.parseInt(args[0]);
			String fileName = args[1];
			
			String dir = System.getProperty("user.dir") + "\\src\\com\\test\\java\\ch15\\" + fileName;
			File f = new File(dir);
			
			System.out.println(dir);
			System.out.println(f.getAbsolutePath());
			
//			if(!f.exists() || !f.isDirectory()) {
//				System.out.println(fileName + "은/는 디텍토리이거나, 존재하지 않는 파일입니다.");
//				System.exit(0);
//			}
			
			FileReader fr = new FileReader(f.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			
			String ln ="";
			for(int i=1; (ln = br.readLine())!=null;i++) {
				if(ln.indexOf(";")!=-1) {
					System.out.println(i+":"+line);
				}
			}
			br.close();
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("USAGE : java FileHead 10 FILENAME");
		}
		catch (IOException e) {}
		
	}
}
