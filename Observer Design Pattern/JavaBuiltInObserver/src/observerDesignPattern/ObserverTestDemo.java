package observerDesignPattern;

import java.util.Observer;

public class ObserverTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		Observer observer = new TestObserver(weatherData);
		weatherData.addObserver(observer);
		Observer observer2 = new TestObserver(weatherData);
		weatherData.addObserver(observer2);
		try{
			Thread.sleep(5000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			weatherData.setTemparature(50);
		}
	}

}
