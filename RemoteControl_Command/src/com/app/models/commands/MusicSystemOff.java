package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.MusicSystem;

public class MusicSystemOff implements Command {
	private MusicSystem ms;

	public MusicSystemOff(MusicSystem ms) {
		this.ms = ms;
	}

	@Override
	public void execute() {
		ms.off();
	}

	@Override
	public void undo() {
		ms.on();
		
	}

}
