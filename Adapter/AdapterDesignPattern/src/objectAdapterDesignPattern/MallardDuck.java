package objectAdapterDesignPattern;

import adapterDesignPatternHelper.Duck;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack....");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Duck is flying");
	}

}
