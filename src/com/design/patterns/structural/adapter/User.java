package com.design.patterns.structural.adapter;

import java.util.ArrayList;

public class User {

	/**
	 * Adapter Pattern
	 * 변경할 수 없는 클래스를 원하는 형태의 인터페이스나
	 * 클래스로 사용하고자 할 때 어댑터 클래스를 도입해 사용할 수 있다.
	 */

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Dog("댕이"));
		animals.add(new Cat("솜털이"));
		animals.add(new Cat("츄츄"));
		// animals.add(new Tiger("타이온"));
		animals.add(new TigerAdapter("타이온"));

		animals.forEach(Animal::sound);

	}
}
