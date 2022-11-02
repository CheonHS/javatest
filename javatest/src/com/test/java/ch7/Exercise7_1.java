package com.test.java.ch7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
//---------------------------------------------------
//	7-1
		/*
		for(int i=0, j=cards.length/2 ; i<cards.length; i++) {	
				
			if(i<j) {
				if((i+1)==1||(i+1)==3||(i+1)==8) {
					cards[i] = new SutdaCard(i+1, true);
				}else {
					cards[i] = new SutdaCard(i+1, false);
				}
				
			}else {
				cards[i] = new SutdaCard(i+1-j, false);
			}
				
				
		}*/
		
		for (int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = false;
			
			if (i==0 || i==2 || i==7)
				isKwang = true;
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

//---------------------------------------------------
//	7-2
	void shuffle(){
		SutdaCard sc = null;
		 for(int i=0; i<cards.length; i++) {
			 int ranNum = (int)(Math.random()*cards.length);
			 sc = cards[ranNum];
			 cards[ranNum] = cards[i];
			 cards[i]= sc;

		}	 
	}

	SutdaCard pick(int index) {
		return cards[index];
	}
	SutdaCard pick() {
		return cards[(int)(Math.random()*cards.length)];
	}
		
//---------------------------------------------------

}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Exercise7_1 {
	public static void main(String args[]) {
//		7-1
//		
//		SutdaDeck deck = new SutdaDeck();
//		for(int i=0; i<deck.cards.length; i++) {
//			System.out.print(deck.cards[i] + " , ");
//		}
		
//		---------------------------------------------------
//		7-2
		
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + " , ");
		}
		System.out.println();
		System.out.println(deck.pick());
		
	}
}
