package com.design.patterns.creational.abstractfatory;

import com.design.patterns.creational.abstractfatory.component.Button;
import com.design.patterns.creational.abstractfatory.component.CheckBox;
import com.design.patterns.creational.abstractfatory.component.TextEdit;
import com.design.patterns.creational.abstractfatory.factory.ComponentFactory;
import com.design.patterns.creational.abstractfatory.factory.LinuxFactory;

public class MainEntry {

	/**
	 * Abstract Factory Pattern
	 * 먼저 만들어야 할 컴포넌트 들을 추상적으로 정하고,
	 * 어떤 구체적인 상황이 주어지면 각 컴포넌트들을 구체적으로 만드는 패턴
	 */

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
