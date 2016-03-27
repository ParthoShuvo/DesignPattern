package example1;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private double temperature;
	private double pressure;
	private WeatherData weatherData = null;

	protected CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("temperature is :" + temperature + " pressure: " + pressure);

	}

	@Override
	public void update(Observable observable, Object args) {
		// TODO Auto-generated method stub
		if (observable.getClass() == weatherData.getClass() && args != null) {
			System.out.println((String) args);
			temperature = weatherData.getTemperature();
			pressure = weatherData.getPressure();
			display();
		}

	}

}
