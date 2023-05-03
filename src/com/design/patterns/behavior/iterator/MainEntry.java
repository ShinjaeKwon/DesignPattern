package com.design.patterns.behavior.iterator;

public class MainEntry {

	/**
	 * Iterator Pattern
	 * 컬렉션 내부의 요소를 순서대로 접근하는 방법을 제공하는 패턴
	 * 컬렉션과 요소 간의 결합도를 낮추며, 요소에 대한 접근 방식을 표준화 하여 코드의 재사용성을 높이는 장점이 있다.
	 * 컬렉션 내부에 Iterator 객체를 만들어 요소를 순회하며 접근한다.
	 */

	public static void main(String[] args) {
		Item[] items = {
			new Item("CPU", 1000),
			new Item("Keyboard", 2000),
			new Item("Mouse", 3000),
			new Item("HDD", 50)
		};

		Array array = new Array(items);
		Iterator it = array.iterator();

		while (it.next()) {
			Item item = (Item)it.current();
			System.out.println(item);
		}
	}
}
