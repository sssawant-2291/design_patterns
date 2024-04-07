package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.GarageDoor;

public class GarageDoorLightsOff implements Command {
	private GarageDoor gdoor;

	public GarageDoorLightsOff(GarageDoor gdoor) {
		this.gdoor = gdoor;
	}

	@Override
	public void execute() {
		gdoor.lightsOff();
	}

	@Override
	public void undo() {
		gdoor.lightsOn();
		
	}

}
