package com.design.patterns.structural.chainofresponsibility;

public class ProtocolHandler extends Handler {

	@Override
	protected void process(String url) {
		int index = url.indexOf("://");
		if (index != -1) {
			System.out.println("Protocol: " + url.substring(0, index));
			return;
		}
		System.out.println("No Protocol");
	}
}
