package com.design.patterns.builder.methodchaining;

public class Car {

	private String engine;
	private boolean airbag;
	private String color;
	private boolean cameraSensor;
	private boolean AEB;

	public Car(String engine, boolean airbag, String color, boolean cameraSensor, boolean AEB) {
		this.engine = engine;
		this.airbag = airbag;
		this.color = color;
		this.cameraSensor = cameraSensor;
		this.AEB = AEB;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("# CAR SPEC\n");
		sb.append("  CameraSensor ").append(cameraSensor ? "Y" : "N").append("\n");
		sb.append("        Engine ").append(engine).append("\n");
		sb.append("        Airbag ").append(airbag ? "Y" : "N").append("\n");
		sb.append("         Color ").append(color).append("\n");
		sb.append("           AEB ").append(AEB ? "Y" : "N").append("\n");

		return sb.toString();
	}
}
