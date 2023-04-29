package com.design.patterns.creational.factorymethod;

public class MainEntry {

	/**
	 * Factory Method Pattern
	 * 객체 생성을 위한 패턴
	 * 객체 생성에 필요한 과정을 템플릿 처럼 정해 놓고 각 과정을 다양하게 구현 가능
	 * 구체적으로 생성할 클래스를 유연하게 정할 수 있음
	 * 객체 생성에 대한 인터페이스와 구현의 분리
	 * 객체 생성에 대한 책임을 서브 클래스에게 떠넘기는 디자인 패턴
	 * 객체를 생성하는 코드와 실제 객체의 타입을 분리할 수 있음
	 */

	public static void main(String[] args) {
		Factory factory = new ItemFactory();

		Item item1 = factory.create("sword");
		if (item1 != null)
			item1.use();

		Item item2 = factory.create("sword");
		if (item2 != null)
			item2.use();

		Item item3 = factory.create("sword");
		if (item3 != null)
			item3.use();

		Item item4 = factory.create("sword");
		if (item4 != null)
			item4.use();

		Item item5 = factory.create("sword");
		if (item5 != null)
			item5.use();

		factory.create("shield");
		factory.create("shield");
		factory.create("shield");
		factory.create("shield");

		factory.create("bow");
		factory.create("bow");
		factory.create("bow");

	}
}
