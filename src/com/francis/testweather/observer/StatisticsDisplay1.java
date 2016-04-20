package com.francis.testweather.observer;
import java.util.Observable;
import java.util.Observer;

import com.francis.testweather.subject.WeatherData1;


public class StatisticsDisplay1 implements Observer,DisplayElement{
	private float temp;
	private float humidity;
	public StatisticsDisplay1(Observable observable){
		observable.addObserver(this);
	}
	public void display() {
		System.out.println("DisplayElement1:   "+temp+"  "+humidity);
	}
	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof WeatherData1) {
			WeatherData1 weatherData1=(WeatherData1)arg0;
			this.temp=weatherData1.getTemperture();
			this.humidity=weatherData1.getHumidity();
			display();
		}
	}
	
}
