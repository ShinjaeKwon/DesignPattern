package com.design.patterns.structural.decorator;

public abstract class Decorator extends Item {

	protected Item item;

	public Decorator(Item item) {
		this.item = item;
	}

	@Override
	public int getLinesCount() {
		return 0;
	}

	@Override
	public int getMaxLength() {
		return 0;
	}

	@Override
	public int getLength(int index) {
		return 0;
	}

	@Override
	public String getString(int index) {
		return null;
	}
}
