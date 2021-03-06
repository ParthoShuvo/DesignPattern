package observerDesignPattern;

import java.util.ArrayList;

import observerDesignPatternHelper.Observer;
import observerDesignPatternHelper.Subject;

public class PostOffice implements Subject {

	private String address;
	private ArrayList<Observer> observers;

	public PostOffice(String address) {
		super();
		this.address = address;
		observers = new ArrayList<Observer>();
	}

	public String getAddress() {
		return address;
	}

	@Override
	public void addObserver(Observer ob) {
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
			observers.get(i).update();
		}
	}

	public void newMail() {
		notifyObservers();
	}

}
