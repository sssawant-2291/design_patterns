package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.GarageDoor;

public class GarageDoorDown implements Command {
	private GarageDoor gdoor;

	public GarageDoorDown(GarageDoor gdoor) {
		this.gdoor = gdoor;
	}

	@Override
	public void execute() {
		gdoor.down();
	}

	@Override
	public void undo() {
		gdoor.up();
		
	}

}
