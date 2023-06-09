package com.design.patterns.structural.bridge;

public class SimpleDisplay implements Display {

	@Override
	public void title(Draft draft) {
		System.out.println(draft.getTitle());
	}

	@Override
	public void author(Draft draft) {
		System.out.println(draft.getAuthor());
	}

	@Override
	public void content(Draft draft) {
		var content = draft.getContent();
		for (String s : content) {
			System.out.println(s);
		}
	}
}
