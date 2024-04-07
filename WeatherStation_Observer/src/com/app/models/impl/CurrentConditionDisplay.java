package com.app.models.impl;

import com.app.models.DisplayElement;
import com.app.models.Observer;
import com.app.models.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private Float temp;
	private Float humidity;
	private Float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.printf("Current temp : %f, humidity: %f, pressure: %f ", temp, humidity, pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
