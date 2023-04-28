package com.design.patterns.builder.multiplesteps;

public class MainEntry {

	/**
	 * Builder Pattern 2
	 * 객체 생성 시 여러 단계를 순차적으로 거칠 때, 이 단계의 순서를 결정해두고,
	 * 각 단계를 다양하게 구현할 수 있도록 하는 패턴
	 * */

	public static void main(String[] args) {
		Data data = new Data("Jane", 25);

		Builder builder = new PlainTextBuilder(data);
		Director director = new Director(builder);
		String result = director.build();
		System.out.println(result);

		builder = new JSONBuilder(data);
		director = new Director(builder);
		result = director.build();
		System.out.println(result);

		builder = new XMLBuilder(data);
		director = new Director(builder);
		result = director.build();
		System.out.println(result);


	}
}
