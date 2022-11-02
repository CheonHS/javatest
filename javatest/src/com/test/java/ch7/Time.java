package com.test.java.ch7;

class TimeVo {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) return;
		this.second = second;
	}
	
	// --------------------------------
	
}

public class Time {
	public static void main(String[] args) {
		TimeVo t = new TimeVo();
		//t.hour=500;
		t.setHour(7);
		t.setMinute(30);
		t.setSecond(35);
		
		System.out.println("현재 시간 : " +
					t.getHour() + "시 " +
					t.getMinute() + "분 " +
					t.getSecond() + "초 입니다");
	}
}

