package com.app.testApp;

import com.app.models.impl.CurrentConditionDisplay;
import com.app.models.impl.WeatherData;

public class TestWeatherDisplay {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 90, 1.2f);
	}

}