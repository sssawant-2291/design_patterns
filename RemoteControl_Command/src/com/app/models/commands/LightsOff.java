package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.Light;

public class LightsOff implements Command {

	private Light light;

	public LightsOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
}
