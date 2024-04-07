package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.Sprinkler;

public class SprinklerOn implements Command {
	private Sprinkler sprinkler;

	public SprinklerOn(Sprinkler sprinkler) {
		this.sprinkler = sprinkler;
	}

	@Override
	public void execute() {
		sprinkler.waterOn();
	}

	@Override
	public void undo() {
		sprinkler.waterOff();
		
	}

}
