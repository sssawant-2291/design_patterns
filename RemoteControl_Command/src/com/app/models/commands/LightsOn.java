package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.Light;

public class LightsOn implements Command {
	private Light light;

	public LightsOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
