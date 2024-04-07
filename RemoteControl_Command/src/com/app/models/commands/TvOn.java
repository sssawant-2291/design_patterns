package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.Tv;

public class TvOn implements Command {
	private Tv tv;

	public TvOn(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
		
	}

}
