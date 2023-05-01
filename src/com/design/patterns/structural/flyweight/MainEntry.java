package com.design.patterns.structural.flyweight;

public class MainEntry {

	/**
	 * Flyweight Pattern
	 * 여러 개의 유사한 객체를 생성하는 경우 메모리 사용량을 줄이기 위한 패턴
	 * 객체를 공유하여 메모리를 효율적으로 사용하며, 이를 통해 시스템 성능을 향상시킬 수 있다.
	 * <p>
	 * 1. 메모리 사용량 감소
	 * 2. 객체 생성 비용 감소
	 * 3. 시스템 성능 향상
	 * <p>
	 * 플라이웨이트 패턴의 예로 문자열 상수, Integer.valueOf() 가 있다.
	 */

	public static void main(String[] args) {
		Number number = new Number(33331);
		number.print(5, 5);

		System.out.println();
		System.out.println();
		System.out.println();
	}
}
