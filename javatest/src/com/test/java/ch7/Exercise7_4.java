package com.test.java.ch7;

class MyTv{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevCh;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//--------------------------------
	void setChannel(int channel) {
		/*setPrevCh(getChannel());
		this.channel = channel;*/
		
		prevCh = this.channel;
		this.channel = channel;
	}
	
	int getChannel() {
		return channel;
	}
	
	void setVolume(int volume) {
		this.volume = volume;
	}
	
	int getVolume() {
		return volume;
	}
	//--------------------------------
	//7-5	
	
	
	void setPrevCh(int prevCh) {
		this.prevCh = prevCh;
	}
	
	int getPrevCh() {
		return prevCh;
	}
	void gotoPrevChannel(){
		 setChannel(getPrevCh());
	}
	//--------------------------------
	
	
}
public class Exercise7_4 {
	public static void main(String args[]) {
		MyTv t = new MyTv();

//		7-4
//		t.setChannel(10);
//		System.out.println("CH:" + t.getChannel() + " / Pre : " + t.getPrevCh());
//		t.setVolume(20);
//		System.out.println("VOL:" + t.getVolume()+ " / Pre : " + t.getPrevCh());
		
//		7-5
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel() + " / PreCh : " + t.getPrevCh());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel() + " / PreCh : " + t.getPrevCh());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel()+ " / PreCh : " + t.getPrevCh());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel()+ " / PreCh : " + t.getPrevCh());
		
		
	}
}
