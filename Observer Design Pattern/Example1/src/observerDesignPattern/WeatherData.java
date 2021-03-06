package observerDesignPattern;

import java.util.ArrayList;

import observerDesignPatternHelper.Observer;
import observerDesignPatternHelper.Subject;

public class WeatherData implements Subject {

	private float temp;
	private float pressure;
	private float humidity;
	private ArrayList<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	

	public float getTemp() {
		return temp;
	}



	public void setTemp(float temp) {
		this.temp = temp;
	}



	public float getPressure() {
		return pressure;
	}



	public void setPressure(float pressure) {
		this.pressure = pressure;
	}



	public float getHumidity() {
		return humidity;
	}



	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}



	@Override
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.remove(ob);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(temp, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}

}
