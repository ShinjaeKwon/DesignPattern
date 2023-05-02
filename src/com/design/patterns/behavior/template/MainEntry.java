package com.design.patterns.behavior.template;

import java.util.ArrayList;
import java.util.List;

public class MainEntry {

	/**
	 * Template Pattern
	 * 코드의 중복을 방지하기 위해 템플릿으로부터 구체적인 구현을 분리하는 패턴
	 * 어떤 기능에 대해 실행 되어야 할 각 단계만 정의해 놓고(각 단계의 구체적인 코드 구현은 없음),
	 * 하위 클래스가 각 단계를 구현하는 패턴
	 * 즉, 하위 클래스에서 템플릿 메서드를 오버라이드하여 자신에게 맞는 구체적인 로직을 구현
	 */

	public static void main(String[] args) {
		String title = "디자인패턴";

		List<String> content = new ArrayList<>();
		content.add("디자인 패턴이란 ..");
		content.add("공부하는 방법은 ");
		content.add("반복적으로 하면 ");
		content.add("쉽게 응용");

		String footer = "2023.05.02";

		Article article = new Article(title, content, footer);

		System.out.println("[CASE-1]");
		DisplayArticleTemplate style1 = new SimpleDisplayArticle(article);
		style1.display();

		System.out.println("[CASE-2]");
		DisplayArticleTemplate style2 = new CaptionDisplayArticle(article);
		style2.display();
	}
}
