package com.design.patterns.behavior.observer;

public class MainEntry {

	/**
	 * Observer Pattern
	 * 객체의 상태 변화를 관찰하고, 이를 관찰하는 객체들에게 자동으로 알림을 전달하는 패턴
	 */

	public static void main(String[] args) {
		DiceGame diceGame = new FairDiceGame();

		Player player1 = new EvenBettingPlayer("짝궁댕이");
		Player player2 = new EvenBettingPlayer("홀아비");
		Player player3 = new EvenBettingPlayer("홀쭉이");

		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);

		for (int i = 0; i < 5; i++) {
			diceGame.play();
			System.out.println();
		}
	}
}
