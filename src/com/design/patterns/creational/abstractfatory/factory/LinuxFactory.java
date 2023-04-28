package com.design.patterns.creational.abstractfatory.factory;

import com.design.patterns.creational.abstractfatory.component.Button;
import com.design.patterns.creational.abstractfatory.component.CheckBox;
import com.design.patterns.creational.abstractfatory.component.TextEdit;
import com.design.patterns.creational.abstractfatory.implementation.linux.LinuxButton;
import com.design.patterns.creational.abstractfatory.implementation.linux.LinuxCheckBox;
import com.design.patterns.creational.abstractfatory.implementation.linux.LinuxTextEdit;

public class LinuxFactory implements ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new LinuxButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new LinuxCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new LinuxTextEdit(value);
	}
}
