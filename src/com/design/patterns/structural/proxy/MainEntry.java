package com.design.patterns.structural.proxy;

public class MainEntry {

	/**
	 * Proxy Pattern
	 * 객체의 대리자 또는 대변인 역할을 하는 객체를 제공하는 패턴
	 * 프록시 객체는 실제 객체와 동일한 인터페이스를 구현하며, 실제 객체와 동일한 기능을 수행하지만,
	 * 실제 객체의 기능을 수행하기 전에 추가적인 작업을 수행하거나, 실제 객체의 접근을 제어하는 등의
	 * 역할을 한다.
	 * 어떤 작업의 실행을 대리인을 통해 실행하도록 하는 패턴
	 * 어떤 요청에 대해 결과를 캐싱해 같은 요청이 올시 캐시 데이터를 반환해 성능 향상을 할 수 있다.
	 * */

	public static void main(String[] args) {
		// Display display = new ScreenDisplay();
		Display display = new BufferDisplay(3);

		display.print("안녕하세요.");
		display.print("소프트웨어 설계를 위한 디자인 패턴은");
		display.print("큰 규모의 소프트웨어 개발에 큰 도움이 됩니다.");
		display.print("또한 유지보수와 기능 확장에도 매우 도움이 됩니다.");

		((BufferDisplay)display).flush();
	}
}
