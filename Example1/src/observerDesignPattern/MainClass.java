package observerDesignPattern;

import observerDesignPatternHelper.Observer;

public class MainClass {

	public static void main(String[] args) {
		Observer observer;
		WeatherData weatherData = new WeatherData();
		observer = new CurrentConditionsDisplay();
		weatherData.registerObserver(observer);
		observer = new StatisticsDisplay();
		weatherData.registerObserver(observer);
		observer = new ForecastDisplay();
		weatherData.registerObserver(observer);
		weatherData.setTemp(100);
		weatherData.setPressure((float)52.2);
		weatherData.setHumidity((float)52.3);
		weatherData.measurementChanged();
		
	}

}
