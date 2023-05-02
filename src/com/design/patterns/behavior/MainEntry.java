package com.design.patterns.behavior;

public class MainEntry {

	/**
	 * Strategy Pattern
	 * 어떤 하나의 기능이 여러가지 단계를 거칠 때, 프로그램 실행 중 1 단계를 교체할 수 있는 패턴\
	 * Context : 클라이언트가 사용하는 인터페이스 제공 - Printer.print()
	 * Strategy : 컨텍스트에서 사용되는 알고리즘을 제공하는 인터페이스 - SumStrategy.get(N)
	 * ConcreteStrategy : 실제 구현 객체 - SimpleSumStrategy, GaussSumStrategy
	 */

	public static void main(String[] args) {
		SumPrinter cal = new SumPrinter();

		cal.print(new SimpleSumStrategy(), 10);
		System.out.println();
		cal.print(new GaussSumStrategy(), 10);

	}
}
