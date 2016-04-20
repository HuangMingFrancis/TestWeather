package com.francis.testweather.observer;

import com.francis.testweather.subject.Subject;

public class StatisticsDisplay implements Observer,DisplayElement{
	
	private float temp,humidity,pressure;
	public StatisticsDisplay(Subject subject){
		subject.registerObserver(this);
	}
	public void display() {
		System.out.println("StatisticsDisplay:  "+temp+" "+humidity+" "+pressure);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}

}
