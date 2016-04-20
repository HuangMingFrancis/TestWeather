package com.francis.testweather.subject;

import java.util.Observable;

/**
 * 使用内置的观察者模式
 * @author Francis
 *
 */
public class WeatherData1 extends Observable{
	private float temperture;
	private float humidity;
	private float pressure;
	public WeatherData1(){}
	public void measurementsChanged(){
		setChanged();
		notifyObservers();//没有传送对象，表示我们采用的做法是“拉”
	}
	
	public void setMeasurements(float temperture,float humidity,float pressure){
		this.temperture=temperture;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	
	public float getTemperture() {
		return temperture;
	}
	public float getHumidity() {
		return humidity;
	}
	public float getPressure() {
		return pressure;
	}
}
