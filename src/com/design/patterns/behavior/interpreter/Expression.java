package com.design.patterns.behavior.interpreter;

public interface Expression {

	boolean parse(Context context);

	boolean run();
}
