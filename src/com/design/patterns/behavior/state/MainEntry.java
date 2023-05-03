package com.design.patterns.behavior.state;

import java.util.Scanner;

public class MainEntry {

	/**
	 * State Pattern
	 * 객체의 내부 상태가 바뀔 때마다 다른 행동을 수행하도록 하는 패턴
	 * 객체의 상태를 클래스로 표현하고, 상태에 따른 행동을 캡슐화하여 상태에 따라 다르게 동작할 수 있도록 한다.
	 * 상태를 객체화 한 패턴
	 * 조건절(if)을 효과적으로 줄여주는 패턴
	 */

	public static void main(String[] args) {
		Player player = new Player();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
				"플레이어의 상태 : " + player.getState().getDescription() + " / 속도: " + player.getSpeed() + "km/h");
			System.out.print("[1]제자리 서기 [2]앉기 [3]걷기 [4]뛰기 [5] 종료 : ");
			String input = sc.next();
			System.out.println();

			if (input.equals("1"))
				player.getState().standUp();
			else if (input.equals("2"))
				player.getState().sitDown();
			else if (input.equals("3"))
				player.getState().walk();
			else if (input.equals("4"))
				player.getState().run();
			else if (input.equals("5"))
				break;
		}

		sc.close();
	}
}
