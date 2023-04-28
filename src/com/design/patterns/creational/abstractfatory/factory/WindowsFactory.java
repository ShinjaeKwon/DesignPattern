package com.design.patterns.creational.abstractfatory.factory;

import com.design.patterns.creational.abstractfatory.component.Button;
import com.design.patterns.creational.abstractfatory.component.CheckBox;
import com.design.patterns.creational.abstractfatory.component.TextEdit;
import com.design.patterns.creational.abstractfatory.implementation.windows.WindowsButton;
import com.design.patterns.creational.abstractfatory.implementation.windows.WindowsCheckBox;
import com.design.patterns.creational.abstractfatory.implementation.windows.WindowsTextEdit;

public class WindowsFactory implements ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new WindowsButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new WindowsCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new WindowsTextEdit(value);
	}
}
