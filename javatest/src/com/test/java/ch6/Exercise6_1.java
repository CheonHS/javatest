package com.test.java.ch6;

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}

	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//-----------------------------

	String info(){
		
		return name +","+ ban + ","+ no + ","
		+ kor + ","+ eng + ","+ math + ","
		+ (kor+eng+math) + ","+ getAverage();
	}
	
	//-----------------------------

	
	int getTotal(){
		return kor+eng+math;
	}
	
	float getAverage(){
		return Math.round(getTotal()/3f*10)/10f;
	}
}
