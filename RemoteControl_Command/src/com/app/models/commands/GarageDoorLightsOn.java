package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.GarageDoor;

public class GarageDoorLightsOn implements Command {
	private GarageDoor gdoor;

	public GarageDoorLightsOn(GarageDoor gdoor) {
		this.gdoor = gdoor;
	}

	@Override
	public void execute() {
		gdoor.lightsOn();
	}

	@Override
	public void undo() {
		gdoor.lightsOff();

	}

}
