package com.design.patterns.structural.flyweight;

public class DigitFactory {

	private Digit[] pool = new Digit[] {
		null, null, null, null, null, null, null, null, null, null
	};

	public Digit getDigit(int n) {
		if (pool[n] != null) {
			return pool[n];
		}
		String fileName = String.format("../data/%d.txt", n);
		Digit digit = new Digit(fileName);
		pool[n] = digit;
		return digit;
	}
}
