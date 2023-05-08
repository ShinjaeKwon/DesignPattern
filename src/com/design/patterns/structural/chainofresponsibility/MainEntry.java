package com.design.patterns.structural.chainofresponsibility;

public class MainEntry {

	/**
	 * Chain of Responsibility
	 * 요청을 처리할 수 있는 객체들의 연결을 만들어 처리할 수 있는 객체를 찾을 때 까지 요청을 계속해서 전달하는
	 * 방식을 사용한다.
	 * 책임이란 무언가를 처리하는 기능(클래스)
	 * 여러 개의 책임들을 동적으로 연결해서 순차적으로 실행하는 패턴
	 * 기능을 클래스 별로 분리하여 구현하도록 유도하므로 클래스의 코드가 최적화됨
	 */

	public static void main(String[] args) {
		Handler handler1 = new ProtocolHandler();
		Handler handler2 = new PortHandler();
		Handler handler3 = new DomainHandler();

		handler1.setNext(handler2).setNext(handler3);

		String url = "http://www.youtub.com:1087";
		System.out.println("INPUT: " + url);

		handler1.run(url);
	}
}
