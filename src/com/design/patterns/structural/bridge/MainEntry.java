package com.design.patterns.structural.bridge;

public class MainEntry {

	/**
	 * Bridge Pattern
	 * 추상화와 구현을 분리하여 서로 독립적으로 변경할 수 있도록 한다.
	 * 기능 계층과 구현계층의 분리로 시스템의 확장성과 유지보수성을 높이는 패턴
	 * 새로운 기능이 추가되면 기존 클래스의 변경 없이도 해결이 가능하다.
	 */

	public static void main(String[] args) {
		var title = "복원된 지구";
		var author = "김형준";
		String[] content = {
			"플라스틱 사용의 감소와",
			"바다 생물 어획량 감소로 인하여",
			"지구는 복원되었다."
		};

		Draft draft = new Draft(title, author, content);
		Display display1 = new SimpleDisplay();
		draft.print(display1);

		Display display2 = new CaptionDisplay();
		draft.print(display2);

		var publisher = "복악출판";
		var cost = 100;

		Publication publication = new Publication(title, author, content, publisher, cost);

		publication.print(display1);
		publication.print(display2);

	}
}
