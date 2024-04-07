package com.app.models.remote;

import com.app.models.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command cmd) {
		slot = cmd;
	}
	
	public void buttonPressed() {
		slot.execute();
	}
}
