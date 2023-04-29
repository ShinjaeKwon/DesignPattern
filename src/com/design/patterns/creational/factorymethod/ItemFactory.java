package com.design.patterns.creational.factorymethod;

import java.util.HashMap;

public class ItemFactory extends Factory {

	private class ItemData {
		int maxCount;
		int currentCount;

		ItemData(int maxCount) {
			this.maxCount = maxCount;
		}
	}

	private HashMap<String, ItemData> repository;

	public ItemFactory() {
		this.repository = new HashMap<>();

		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
		repository.put("bow", new ItemData(1));
	}

	@Override
	public boolean isCreatable(String name) {
		ItemData itemData = repository.get(name);

		if (itemData == null) {
			System.out.println(name + "은 알 수 없는 아이템입니다.");
			return false;
		}

		if (itemData.currentCount >= itemData.maxCount) {
			System.out.println(name + "은 품절 아이템입니다.");
			return false;
		}

		return true;
	}

	@Override
	public Item createItem(String name) {

		if (name.equals("sword")) {
			return new Sword();
		}

		if (name.equals("shield")) {
			return new Sword();
		}

		if (name.equals("bow")) {
			return new Sword();
		}

		return null;
	}

	@Override
	public void postprocessItem(String name) {
		ItemData itemData = repository.get(name);
		if (itemData != null) {
			itemData.currentCount++;
		}
	}
}
