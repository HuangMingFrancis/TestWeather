package com.francis.testweather.observer;

import java.util.Observable;
import java.util.Observer;

import com.francis.testweather.subject.WeatherData1;
/**
 * 调用的是系统的Observer
 * import java.util.Observable;
   import java.util.Observer;
 * @author Francis
 *
 */
public class CurrentConditionsDisplay1 implements Observer,DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay1(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	public void display() {
		System.out.println("CurrentConditionsDisplay1:  "+temperature+" "+humidity);
	}

	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof WeatherData1) {
			WeatherData1 weatherData1=(WeatherData1)arg0;
			this.temperature=weatherData1.getTemperture();
			this.humidity=weatherData1.getHumidity();
			display();
		}
	}

}
