package com.design.patterns.structural.decorator;

public class LineNumberDecorator extends Decorator {
	public LineNumberDecorator(Item item) {
		super(item);
	}

	@Override
	public int getLinesCount() {
		return super.getLinesCount();
	}

	@Override
	public int getMaxLength() {
		return super.getMaxLength() + 4;
	}

	@Override
	public int getLength(int index) {
		return super.getLength(index) + 4;
	}

	@Override
	public String getString(int index) {
		return String.format("%02d", index) + ": " + item.getString(index);
	}
}
