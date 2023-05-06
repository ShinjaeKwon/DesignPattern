package com.design.patterns.structural.facade;

public class MainEntry {

	/**
	 * Facade Pattern
	 * 복잡한 시스템을 단순한 인터페이스로 제공하여 사용자가 사용하기 쉽게 만드는 것을 목적으로 한다.
	 * 어떤 기능을 처리하기 위해 여러 객체들 사이의 복잡한 메서드 사용을 감춰서 단순화 시켜주는 패턴
	 * 하위 시스템의 복잡한 구조를 캡슐화 한 뒤, 단순한 인터페이스를 제공한다.
	 * 이를 통해 하위 시스템의 복잡성을 숨기고, 사용자가 편리하게 접근할 수 있도록 한다.
	 */

	public static void main(String[] args) {
/*		DBMS dbms = new DBMS();
		Cache cache = new Cache();*/
		Facade facade = new Facade();
		String name = "Dorosh";

		facade.run(name);

		/*Row row = cache.get(name);

		if (row == null) {
			row = dbms.query(name);
			if (row != null) {
				cache.put(row);
			}
		}

		if (row != null) {
			Message message = new Message(row);

			System.out.println(message.makeName());
			System.out.println(message.makeBirthday());
			System.out.println(message.makeEmail());
		} else {
			System.out.println(name + " is not exists");
		}*/

	}
}
