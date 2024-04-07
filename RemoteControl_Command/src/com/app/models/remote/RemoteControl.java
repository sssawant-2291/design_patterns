package com.app.models.remote;

import com.app.models.Command;
import com.app.models.commands.NoCommand;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private Command curCommand;

	public RemoteControl(int numAppliances) {
		NoCommand noCmd = new NoCommand();
		
		
		onCommands = new Command[numAppliances];
		offCommands = new Command[numAppliances];
		curCommand = noCmd;

		for (int i = 0; i < onCommands.length; i++) {

			onCommands[i] = noCmd;
			offCommands[i] = noCmd;
		}

	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonPressed(int slot) {
		if (slot <= onCommands.length && slot >= 0) {
			onCommands[slot].execute();
			curCommand = onCommands[slot];
		} else
			System.out.println(String.format("%d is not in range (0, %d)", slot, onCommands.length));

	}

	public void offButtonPressed(int slot) {
		if (slot <= offCommands.length && slot >= 0) {
			offCommands[slot].execute();
			curCommand = offCommands[slot];
		} else
			System.out.println(String.format("%d is not in range (0, %d)", slot, offCommands.length));

	}

	public void undo() {
		curCommand.undo();
	}
	


	@Override
	public String toString() {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("\n----------------- Remote Control ------------------\n");
		for (int i = 0; i < onCommands.length; i++) {

			strBuffer.append("[ slot " + i + " ]  " + onCommands[i].getClass().getSimpleName() + " --- "
					+ offCommands[i].getClass().getSimpleName() + "\n");

		}

		return strBuffer.toString();
	}

}
