package com.design.patterns.creational.abstractfatory.implementation.windows;

import com.design.patterns.creational.abstractfatory.component.Button;

public class WindowsButton extends Button {

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println(
			"Windows 렌더링 API를 이용해 " + this.caption + " 버튼을 그립니다."
		);
	}
}
