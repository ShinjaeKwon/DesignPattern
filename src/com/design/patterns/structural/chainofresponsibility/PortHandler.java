package com.design.patterns.structural.chainofresponsibility;

public class PortHandler extends Handler {

	@Override
	protected void process(String url) {
		int index = url.lastIndexOf(":");
		if (index != -1) {
			String strPort = url.substring(index + 1);
			try {
				int port = Integer.parseInt(strPort);
				System.out.println("Port : " + port);
				return;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		System.out.println("No Port");
	}
}
