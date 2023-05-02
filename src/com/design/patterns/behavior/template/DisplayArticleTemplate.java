package com.design.patterns.behavior.template;

public abstract class DisplayArticleTemplate {

	protected Article article;

	public DisplayArticleTemplate(Article article) {
		this.article = article;
	}

	public final void display() {
		title();
		content();
		footer();
	}

	public abstract void title();

	public abstract void content();

	public abstract void footer();

}
