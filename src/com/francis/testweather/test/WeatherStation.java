package com.francis.testweather.test;

import com.francis.testweather.observer.CurrentConditionsDisplay;
import com.francis.testweather.observer.CurrentConditionsDisplay1;
import com.francis.testweather.observer.DisplayElement;
import com.francis.testweather.observer.StatisticsDisplay1;
import com.francis.testweather.observer.StatisticsDisplay;
import com.francis.testweather.subject.WeatherData;
import com.francis.testweather.subject.WeatherData1;

public class WeatherStation {
	public static void main(String[] args) {
//		WeatherData weatherData=new WeatherData();
//		CurrentConditionsDisplay conditionsDisplay=new CurrentConditionsDisplay(weatherData);
//		weatherData.setMeasurements(80, 65, 30.4f);
//		weatherData.setMeasurements(82, 67, 29.4f);
//		weatherData.setMeasurements(78, 69, 33.4f);
//		StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
//		weatherData.setMeasurements(80, 65, 30.4f);
//		weatherData.setMeasurements(82, 67, 29.4f);
//		weatherData.setMeasurements(78, 69, 33.4f);
		
		WeatherData1 weatherData1=new WeatherData1();
		CurrentConditionsDisplay1 conditionsDisplay1=new CurrentConditionsDisplay1(weatherData1);
		StatisticsDisplay1 statisticsDisplay1=new StatisticsDisplay1(weatherData1);
		weatherData1.setMeasurements(80, 65, 30.3f);
		weatherData1.setMeasurements(82, 67, 33.3f);
	}
}
