package observerDesignPattern;

import observerDesignPatternHelper.Observer;

public class CurrentConditionsDisplay implements Observer {

	public CurrentConditionsDisplay() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("Current Conditions are: \n" + "Temparature is: " + temp 
				+ "\nHumidity is: " + humidity + "\nPressure is: " + pressure);
	}

}
