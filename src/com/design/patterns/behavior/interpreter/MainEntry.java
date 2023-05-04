package com.design.patterns.behavior.interpreter;

public class MainEntry {

	/**
	 * Interpreter Pattern
	 * 언어나 문법과 같은 구조적인 표현을 해석하는데 주로 사용된다.
	 * 구문 분석 및 해석과 같은 작업을 수행하며, 주로 컴파일러나 인터프리터를 만드는데 사용된다.
	 */

	public static void main(String[] args) {
		String script = "BEGIN FRONT LOOP 3 LOOP 2 RIGHT FRONT END LOOP 3 LEFT END BACK RIGHT END BACK END";
		System.out.println(script);

		Context context = new Context(script);
		Expression expression = new BeginExpression();

		if (expression.parse(context)) {
			System.out.println(expression);

			expression.run();
		}
	}
}
