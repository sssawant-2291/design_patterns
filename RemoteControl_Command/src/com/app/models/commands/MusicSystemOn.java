package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.MusicSystem;

public class MusicSystemOn implements Command {
	private MusicSystem ms;

	public MusicSystemOn(MusicSystem ms) {
		this.ms = ms;
	}

	@Override
	public void execute() {
		ms.on();
	}

	@Override
	public void undo() {
		ms.off();
		
	}

}
