package com.design.patterns.creational.abstractfatory.component;

public abstract class TextEdit {
	protected String value;

	protected TextEdit(String value) {
		this.value = value;
	}

	public void setValue(String value) {
		this.value = value;
		render();
	}

	public abstract void render();

}
