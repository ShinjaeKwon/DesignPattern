package com.design.patterns.creational.abstractfatory.factory;

import com.design.patterns.creational.abstractfatory.component.Button;
import com.design.patterns.creational.abstractfatory.component.CheckBox;
import com.design.patterns.creational.abstractfatory.component.TextEdit;

public interface ComponentFactory {

	Button createButton(String caption);
	CheckBox createCheckBox(boolean bChecked);
	TextEdit createTextEdit(String value);

}
