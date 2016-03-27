package observerdesignpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class NewsChannel implements Subject {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	public NewsChannel() {

	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (observer != null) {
			observerList.add(observer);
		}

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (!observerList.isEmpty() && observer != null) {
			observerList.remove(observer);
		}

	}

	@Override
	public void notifyObserver(String news) {
		// TODO Auto-generated method stub
		if(news != null && !observerList.isEmpty()){
			Iterator<Observer> iterator = observerList.iterator();
			while(iterator.hasNext()){
				Observer observer = iterator.next();
				observer.update(news);
			}
		}
	}

	@Override
	public void measurementChanged() {

		notifyObserver("This is a great news");
	}

}
