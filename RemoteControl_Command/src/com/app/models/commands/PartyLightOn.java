package com.app.models.commands;

import com.app.models.Command;
import com.app.models.appliances.PartyLight;

public class PartyLightOn implements Command {
	private PartyLight pLight;

	public PartyLightOn(PartyLight pLight) {
		this.pLight = pLight;
	}

	@Override
	public void execute() {
		pLight.on();
	}

	@Override
	public void undo() {
		pLight.off();
		
	}

}
