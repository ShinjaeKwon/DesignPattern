package com.design.patterns.structural.composite;

public class MainEntry {

	/**
	 * Composite Pattern
	 * 객체들을 트리 구조로 구성하여 단일 객체와 객체 그룹을 동일하게 처리할 수 있게 한다.
	 * 단일체와 집합체를 공통된 타입으로 처리할 수 있다.
	 */

	public static void main(String[] args) {
		Folder root = new Folder("root");
		root.add(new File("a.txt", 1000));
		root.add(new File("b.txt", 2000));

		Folder sub1 = new Folder("sub1");
		root.add(sub1);
		sub1.add(new File("sa.txt", 100));
		sub1.add(new File("sb.txt", 4000));

		Folder sub2 = new Folder("sub2");
		root.add(sub2);
		sub2.add(new File("SA.txt", 250));
		sub2.add(new File("SB.txt", 340));

		root.list();
	}
}
