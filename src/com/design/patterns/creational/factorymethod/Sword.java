package com.design.patterns.creational.factorymethod;

public class Sword implements Item {

	@Override
	public void use() {
		System.out.println("칼을 사용하였다.");
	}
}
