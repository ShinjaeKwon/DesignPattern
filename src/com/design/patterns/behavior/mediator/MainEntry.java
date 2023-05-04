package com.design.patterns.behavior.mediator;

import java.util.Scanner;

public class MainEntry {

	/**
	 * Mediator Pattern
	 * 객체 간의 상호작용을 중재하는데 사용된다.
	 * 다수의 객체가 서로 상호작용하고, 이들의 관리가 복잡해지는 상황에서 사용된다.
	 * 미디에이터 객체를 사용하여 객체간의 상호작용을 관리하게 된다.
	 * 미디에이터 객체는 객체 간의 상호작용에 대한 정보를 가지고 있으며, 이를 기반으로 객체 간의 통신을 중재한다.
	 */

	public static void main(String[] args) {
		SmartHome home = new SmartHome();

		Scanner sc = new Scanner(System.in);

		do {
			home.report();

			System.out.println("[1] 문 열기");
			System.out.println("[2] 문 닫기");
			System.out.println("[3] 창문 열기");
			System.out.println("[4] 창문 닫기");
			System.out.println("[5] 에어컨 켜기");
			System.out.println("[6] 에어컨 끄기");
			System.out.println("[7] 보일러 켜기");
			System.out.println("[8] 보일러 끄기");

			System.out.print("명령: ");
			int i = sc.nextInt();

			if (i == 1) {
				home.door.open();
			} else if (i == 2) {
				home.door.close();
			} else if (i == 3) {
				home.window.open();
			} else if (i == 4) {
				home.window.close();
			} else if (i == 5) {
				home.aircon.on();
			} else if (i == 6) {
				home.aircon.off();
			} else if (i == 7) {
				home.boiler.on();
			} else if (i == 8) {
				home.boiler.off();
			} else {
				break;
			}

		} while (true);
	}
}
