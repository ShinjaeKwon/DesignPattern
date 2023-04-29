package com.design.patterns.creational.singleton;

public class MainEntry {

	/**
	 * Singleton Pattern
	 * 애플리케이션에서 단 하나의 인스턴스만 생성하도록 하는 패턴.
	 * 인스턴스의 공유와 전역적인 접근이 필요할 경우 사용
	 * 싱글톤 패턴이 적용된 클래스의 객체는 다른 클래스들에서 접근 할 수는 있지만 생성은 하지 못한다.
	 */

	public static void main(String[] args) {
		// King king = new King(); //private 생성자로 막아뒀기 때문에 외부에서 생성 불가능
		King king = King.getInstance();

		king.say();

		King king2 = King.getInstance();

		System.out.println(king == king2 ? "Same Object" : "Different Object");

	}
}
