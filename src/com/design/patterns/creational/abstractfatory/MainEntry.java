package com.design.patterns.creational.abstractfatory;

import com.design.patterns.creational.abstractfatory.component.Button;
import com.design.patterns.creational.abstractfatory.component.CheckBox;
import com.design.patterns.creational.abstractfatory.component.TextEdit;
import com.design.patterns.creational.abstractfatory.factory.ComponentFactory;
import com.design.patterns.creational.abstractfatory.factory.LinuxFactory;

public class MainEntry {

	public static void main(String[] args) {
		ComponentFactory factory = new LinuxFactory();

		Button button = factory.createButton("확인");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("디자인패턴");

		button.render();
		checkBox.render();
		textEdit.render();


		button.clickEvent();
		checkBox.setbChecked(true);
		textEdit.setValue("GoF의 디자인 패턴");

	}
}
