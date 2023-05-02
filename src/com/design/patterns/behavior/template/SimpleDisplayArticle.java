package com.design.patterns.behavior.template;

public class SimpleDisplayArticle extends DisplayArticleTemplate {

	public SimpleDisplayArticle(Article article) {
		super(article);
	}

	@Override
	public void title() {
		System.out.println(article.getTitle());
	}

	@Override
	public void content() {
		for (String s : article.getContent()) {
			System.out.println(s);
		}
	}

	@Override
	public void footer() {
		System.out.println(article.getFooter());
	}
}
