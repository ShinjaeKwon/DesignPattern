package com.design.patterns.builder.methodchaining;

public class MainEntry {

	/**
	 * Builder Pattern 1
	 * 생성시 지정해야 할 인자가 많을 때 사용하는 패턴
	 * 메서드 체이닝을 사용
	 * */

	public static void main(String[] args) {
		Car car1 = new Car("V7", true, "Black", true, false);

		Car car2 = new CarBuilder()
			.setAEB(false)
			.setAirbag(false)
			.setCameraSensor(true)
			.setColor("White")
			.setEngine("V9")
			.build();

		System.out.println(car1);
		System.out.println(car2);
	}
}
