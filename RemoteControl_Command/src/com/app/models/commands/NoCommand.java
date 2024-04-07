package com.app.models.commands;

import com.app.models.Command;

public class NoCommand implements Command {
	public NoCommand() {
	}

	@Override
	public void execute() {
		System.out.println("Nothing to execute...");
	}

	@Override
	public void undo() {
		System.out.println("Nothing to undo...");
	}

}
