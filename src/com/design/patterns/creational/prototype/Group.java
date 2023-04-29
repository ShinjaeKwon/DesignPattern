package com.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Shape, Prototype {

	private ArrayList<Shape> shapes = new ArrayList<>();

	private String name;

	public Group(String name) {
		this.name = name;
	}

	Group addShape(Shape shape) {
		shapes.add(shape);
		return this;
	}

	@Override
	public Object copy() {
		Group newGroup = new Group(name);

		Iterator<Shape> iter = shapes.iterator();
		while (iter.hasNext()) {
			Prototype shape = (Prototype)iter.next();
			newGroup.shapes.add((Shape)shape.copy());
		}

		return newGroup;
	}

	@Override
	public String draw() {
		StringBuffer result = new StringBuffer(name);
		result.append("(");

		Iterator<Shape> iter = shapes.iterator();
		while (iter.hasNext()) {
			Shape shape = iter.next();
			result.append(shape.draw());
			if (iter.hasNext()) {
				result.append(" ");
			}
		}

		result.append(")");
		return result.toString();
	}

	@Override
	public void moveOffset(int dx, int dy) {
		Iterator<Shape> iter = shapes.iterator();
		while (iter.hasNext()) {
			Shape shape = iter.next();
			shape.moveOffset(dx, dy);
		}
	}
}
