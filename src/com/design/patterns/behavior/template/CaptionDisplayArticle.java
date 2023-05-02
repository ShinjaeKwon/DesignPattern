package com.design.patterns.behavior.template;

public class CaptionDisplayArticle extends DisplayArticleTemplate {

	public CaptionDisplayArticle(Article article) {
		super(article);
	}

	@Override
	public void title() {
		System.out.println("title : " + article.getTitle());
	}

	@Override
	public void content() {
		for (String s : article.getContent()) {
			System.out.println("	" + s);
		}
	}

	@Override
	public void footer() {
		System.out.println("footer : " + article.getFooter());
	}
}
