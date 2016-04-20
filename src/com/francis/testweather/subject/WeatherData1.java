package com.francis.testweather.subject;

import java.util.Observable;

/**
 * ʹ�����õĹ۲���ģʽ
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
		notifyObservers();//û�д��Ͷ��󣬱�ʾ���ǲ��õ������ǡ�����
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
