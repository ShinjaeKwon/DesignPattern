package com.design.patterns.behavior.observer;

import java.util.LinkedList;

public abstract class DiceGame {

	protected LinkedList<Player> playerList = new LinkedList<>();

	public void addPlayer(Player player) {
		playerList.add(player);
	}

	public abstract void play();
}
