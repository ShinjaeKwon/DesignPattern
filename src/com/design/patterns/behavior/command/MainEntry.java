package com.design.patterns.behavior.command;

public class MainEntry {

	/**
	 * Command Pattern : 요청을 객체로 캡슐화하여 실행할 수 있도록 만든 패턴
	 * 하나의 명령(기능)을 객체화한 패턴
	 * 객체는 전달할 수 있고 보관할 수 있기 때문에, 명령(기능)을 전달하고 보관할 수 있게 됨
	 */

	public static void main(String[] args) {

		CommandGroup cmdGroup = new CommandGroup();
		Command printCmd = new PrintCommand("안녕하세요 디자인 패턴!");

		cmdGroup.add(new ClearCommand());
		cmdGroup.add(new ColorCommand(ColorCommand.Color.YELLOW));
		cmdGroup.add(printCmd);
		cmdGroup.add(new MoveCommand(10, 1));
		cmdGroup.add(printCmd);
		cmdGroup.add(new MoveCommand(15, 5));
		cmdGroup.add(printCmd);
		cmdGroup.add(new MoveCommand(25, 8));
		cmdGroup.add(new ColorCommand(ColorCommand.Color.GREEN));
		cmdGroup.add(printCmd);
		cmdGroup.run();

	}
}
