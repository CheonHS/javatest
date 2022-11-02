package com.test.java.ch7;

interface Database {
}
class MySQL implements Database{
	
}
class Oracle implements Database{
	
}
class ApplicationContext{
	void config() {
		Database db = new Oracle();
		BoardDAO dao = new BoardDAO();
		dao.setDatabase(db);
	}
}
class BoardDAO{
	private Database db = null;
	void setDatabase(Database db) {
		this.db = db;
	}
	void write() {
//		db.insert();
	}
}
