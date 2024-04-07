package com.app.models;

public interface Command {
	public void execute();
	public void undo();
}
