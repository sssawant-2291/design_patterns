package com.app.models;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
