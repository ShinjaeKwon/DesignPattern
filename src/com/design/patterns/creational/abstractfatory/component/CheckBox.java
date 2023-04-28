package com.design.patterns.creational.abstractfatory.component;

public abstract class CheckBox {

	protected boolean bChecked;

	protected CheckBox(boolean bChecked) {
		this.bChecked = bChecked;
	}

	public void setbChecked(boolean bChecked) {
		this.bChecked = bChecked;
		render();
	}

	public abstract void render();
}
