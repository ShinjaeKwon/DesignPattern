package com.design.patterns.behavior.interpreter;

public abstract class CommandExpression implements Expression {

	protected String keyword;

	public CommandExpression(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public boolean parse(Context context) {
		return false;
	}

	@Override
	public boolean run() {
		return false;
	}
}
