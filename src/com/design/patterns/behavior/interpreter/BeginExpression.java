package com.design.patterns.behavior.interpreter;

public class BeginExpression implements Expression {

	private CommandListExpression expression;

	@Override
	public boolean parse(Context context) {
		if (checkValidKeyword(context.getCurrentKeyword())) {
			context.readNextKeyword();
			expression = new CommandListExpression();
			return expression.parse(context);
		}
		return false;
	}

	@Override
	public boolean run() {
		return expression.run();
	}

	@Override
	public String toString() {
		return "BEGIN " + expression;
	}

	private boolean checkValidKeyword(String currentKeyword) {
		return currentKeyword.equals("BEGIN");
	}
}
