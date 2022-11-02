package com.test.java.ch7;

interface Point {
	public abstract void addPoint();
}
class User implements Point{
	public void addPoint() {
		System.out.println("회원에게 포인트가 추가되었습니다.");
	}
}
class Board implements Point{
	public void addPoint() {
		System.out.println("게시물 등록 포인트를 추가하였습니다.");
	}
}
class TestA{
	public static void main(String[] args) {
		PointService ps = new PointService();
		
		Board board = new Board();
		ps.setPoint(board);
		
		User user = new User();
		ps.setPoint(user);
	}
}
class PointService{
	void setPoint(Point p){
		p.addPoint();
	}
}
