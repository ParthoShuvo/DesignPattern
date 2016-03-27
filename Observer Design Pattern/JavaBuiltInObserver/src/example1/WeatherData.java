package example1;

import java.util.Observable;

public class WeatherData extends Observable {

	private double temperature;

	private double pressure;

	protected WeatherData() {

	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public void measurementChanged() {
		setChanged();
		notifyObservers("New update has been arrived");
	}

}