package observerDesignPattern;

import observerDesignPatternHelper.Observer;

public class MailBox implements Observer {

	String address;
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("New mail :)");
	}

}
