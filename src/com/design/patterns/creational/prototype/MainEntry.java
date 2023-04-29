package com.design.patterns.creational.prototype;

public class MainEntry {

	/**
	 * Prototype Pattern
	 * 실행 중에 생성된 객체로 다른 객체를 생성하는 패턴
	 * Prototype 으로 만든 객체의 상태를 변경해도 원본 객체의 상태는 변경되지 않음 -> Deep Copy
	 */

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(0);
		pt1.setY(0);

		Point pt2 = new Point();
		pt2.setX(100);
		pt2.setY(0);

		Line line1 = new Line();
		line1.setStartPt(pt1).setEndPt(pt2);

		Line lineCopy = (Line)line1.copy();

		Point pt3 = new Point();
		pt3.setX(100);
		pt3.setY(100);

		Point pt4 = new Point();
		pt4.setX(0);
		pt4.setY(100);

		Line line2 = new Line();
		line2.setStartPt(pt2).setEndPt(pt3);

		Line line3 = new Line();
		line3.setStartPt(pt3).setEndPt(pt4);

		Line line4 = new Line();
		line4.setStartPt(pt4).setEndPt(pt1);

		Group rect = new Group("RECT");
		rect.addShape(line1)
			.addShape(line2)
			.addShape(line3)
			.addShape(line4);


		Group cloneRect = (Group)rect.copy();
		cloneRect.moveOffset(100, 100);
		System.out.println(cloneRect.draw());
		System.out.println(rect.draw());

	}
}
