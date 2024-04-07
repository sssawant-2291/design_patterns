package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.GarageDoor;

public class GarageDoorUp implements Command {
	private GarageDoor gdoor;

	public GarageDoorUp(GarageDoor gdoor) {
		this.gdoor = gdoor;
	}

	@Override
	public void execute() {
		gdoor.up();
	}

	@Override
	public void undo() {
		gdoor.down();

	}

}
