package com.design.patterns.structural.decorator;

public class MainEntry {

	/**
	 * Decorator Pattern
	 * 객체에 동적으로 기능을 추가할 수 있는 패턴
	 * 객체에 새로운 기능을 추가할 때, 기존 코드를 변경하지 않고 기능을 추가할 수 있다.
	 * 데코레이터 패턴은 객체를 감싸는 래퍼 클래스를 정의하고, 래퍼 클래스에서 추가적인 기능을 수행한다.
	 * 1. 기존 코드 변경 없이 새로운 기능 추가
	 * 2. 객체의 구조, 기능 분리
	 * 3. 객체를 동적으로 구성 가능
	 * Java IO 라이브러리에서 입력 스트림과 출력 스트림은 데코레이터 패턴으로 구현되었다.
	 */

	public static void main(String[] args) {

		Strings strings = new Strings();

		strings.add("Hello~");
		strings.add("My Name is Shin Jae Kwon");
		strings.add("I am a Back-end Developer");
		strings.add("Design Pattern is powerful tool");

		// strings.print();

		Item decorator = new SideDecorator(strings, '\"');
		decorator = new LineNumberDecorator(strings);
		decorator = new BoxDecorator(strings);
		decorator.print();
	}

}
