package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.PartyLight;

public class PartyLightOff implements Command {
	private PartyLight pLight;

	public PartyLightOff(PartyLight pLight) {
		this.pLight = pLight;
	}

	@Override
	public void execute() {
		pLight.off();
	}

	@Override
	public void undo() {
		pLight.on();
		
	}

}
