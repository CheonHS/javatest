package com.test.java.ch11;

import java.util.*;

public class Exercise11_6 {
	public static void main(String[] args) {
		Set set = new HashSet();
		int [][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++) {
			int x = (int)(Math.random() * 30) + 1;
			System.out.print(x + (x<10 ? "  / " : " / "));
			if((i+1)%5==0)
				System.out.println(" - " + (i/5+1));
			set.add(x + "");
//			set.add((int)(Math.random() * 30) + 1 + "");
		}
		
		System.out.println();
		List list = new ArrayList(set);
		Collections.shuffle(list);
		Iterator it = list.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				board[i][j] =Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
}
