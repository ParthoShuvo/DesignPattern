package observerDesignPattern;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class TestObserver implements Observer {

	private WeatherData weatherData = null;

	public TestObserver(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void update(Observable observable, Object object) {
		// TODO Auto-generated method stub
			
			Random random = new Random();
			System.out.println("Temperature is: " + (weatherData.getTemparature() + 
					random.nextInt(10)) + " centrigrade");
		

	}

}
