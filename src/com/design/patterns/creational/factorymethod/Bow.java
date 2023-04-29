package com.design.patterns.creational.factorymethod;

public class Bow implements Item {
	@Override
	public void use() {
		System.out.println("활을 사용하였다.");
	}
}
