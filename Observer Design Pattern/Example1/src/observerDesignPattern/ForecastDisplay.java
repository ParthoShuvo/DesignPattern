package observerDesignPattern;

import observerDesignPatternHelper.Observer;

public class ForecastDisplay implements Observer {

	public ForecastDisplay() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("Forcast are: \n" + "Temparature is: " + temp 
				+ "\nHumidity is: " + humidity + "\nPressure is: " + pressure);
	}

}
