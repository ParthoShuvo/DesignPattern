package observerDesignPattern;

import observerDesignPatternHelper.Observer;

public class StatisticsDisplay implements Observer {
	
	public StatisticsDisplay(){
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("Statistics are: \n" + "Temparature is: " + temp 
				+ "\nHumidity is: " + humidity + "\nPressure is: " + pressure);
	}
}
