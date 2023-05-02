package com.design.patterns.behavior;

public class SimpleSumStrategy implements SumStrategy {

	@Override
	public int get(int N) {
		int result = 0;
		for (int i = 1; i <= N; i++) {
			result += i;
		}
		return result;
	}
}
