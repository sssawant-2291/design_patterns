package com.app.models.impl;

import java.util.ArrayList;
import com.app.models.Observer;
import com.app.models.Subject;

public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private Float temp;
	private Float humidity;
	private Float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);
		if (index >= 0)
			observers.remove(index);
			
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i < observers.size(); i++) {
			Observer o = observers.get(i);
			o.update(temp, humidity, pressure);
		}

	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
