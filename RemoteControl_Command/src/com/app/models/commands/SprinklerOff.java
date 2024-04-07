package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.Sprinkler;

public class SprinklerOff implements Command {
	private Sprinkler sprinkler;

	public SprinklerOff(Sprinkler sprinkler) {
		this.sprinkler = sprinkler;
	}

	@Override
	public void execute() {
		sprinkler.waterOff();
	}

	@Override
	public void undo() {
		sprinkler.waterOn();
		
	}

}
