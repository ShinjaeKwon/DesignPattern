package com.design.patterns.structural.facade;

import java.util.HashMap;
import java.util.Map;

public class DBMS {

	private Map<String, Row> db = new HashMap<>();

	public DBMS() {
		db.put("jane", new Row("Jane", "1990-02-14", "jane@naver.com"));
		db.put("minsu", new Row("Minsu", "1992-09-17", "minsu@naver.com"));
		db.put("dorosh", new Row("Dorosh", "1995-08-11", "drsh@naver.com"));
	}

	public Row query(String name) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return db.get(name.toLowerCase());
	}

}
