package com.design.patterns.behavior.memento;

import java.util.Random;

public class MainEntry {

	/**
	 * Memento Pattern
	 * 객체의 상태를 저장하고 이전 상태로 복원하는 패턴
	 * 상태를 캡슐화하여 외부에서 직접 접근할 수 없도록 한다.
	 * 객체의 상태를 기억해 두었다가 필요할 때 기억해둔 상태로 객체를 되돌린다.
	 * 객체의 상태에 대한 기억은 다른 객체에서도 읽기 전용으로 접근할 수 있다.
	 * 객체의 상태에 대한 기억에 대한 생성은 오직 해당 객체만 할 수 있다.
	 */

	public static void main(String[] args) {
		Walker walker = new Walker(0, 0, 10, 10);
		String[] actions = {"UP", "RIGHT", "DOWN", "LEFT"};
		Random random = new Random();
		double minDistance = Double.MAX_VALUE;
		Walker.Memento memento = null;

		while (true) {
			String action = actions[random.nextInt(4)];
			double distance = walker.walk(action);
			System.out.println(action + " " + distance);

			if (distance == 0.0) {
				break;
			}

			if (minDistance > distance) {
				minDistance = distance;
				memento = walker.createMemento();
			} else {
				if (memento != null) {
					walker.restoreMemento(memento);
				}
			}
		}

		System.out.println("Walker's path: " + walker);
	}
}
