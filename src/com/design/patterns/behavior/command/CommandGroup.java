package com.design.patterns.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class CommandGroup implements Command {

	private List<Command> commands = new ArrayList<>();

	public void add(Command command) {
		commands.add(command);
	}

	@Override
	public void run() {
		for (Command command : commands) {
			command.run();
		}
	}
}
