package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.Tv;

public class TvOff implements Command {
	private Tv tv;

	public TvOff(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
		
	}

}
