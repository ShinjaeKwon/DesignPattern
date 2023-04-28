package com.design.patterns.creational.abstractfatory.component;

public abstract class Button {

	protected String caption;

	protected Button(String caption) {
		this.caption = caption;
	}

	public void clickEvent() {
		System.out.println(caption + " 버튼을 클릭했습니다.");
	}

	public abstract void render();
}
