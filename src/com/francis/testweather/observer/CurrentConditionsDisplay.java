package com.francis.testweather.observer;

import com.francis.testweather.subject.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	public void display() {
		System.out.println("CurrentConditions:    "+temperature+" "+humidity+" "+pressure);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}

}
