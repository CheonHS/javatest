package com.test.java.ch9;

public class Exercise9_5 {
	
	static String delChar(String src, String delCh){
		StringBuffer sb = new StringBuffer();
		
		for (int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			if (delCh.indexOf(ch) == -1)
				sb.append(ch);
		}
		
		return sb.toString();
		
		//----------------------

		/*StringBuffer sb = new StringBuffer(src.replace(" ", ""));
		
//		System.out.println("src : " + src + " / delCh : " + delCh);
		
		for(int i = 0; i<delCh.length(); i++)
		{
			char delChPick = delCh.charAt(i);
			int delSrcIndex = sb.toString().indexOf(delChPick);
			
//			System.out.println("char : " + delChPick + " / delIndex : " + delSrcIndex + " / String : " + sb);
			
			if(!(delSrcIndex==-1))
				sb.deleteCharAt(delSrcIndex);
			
		}
			
		return sb.toString();*/
		//----------------------
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
