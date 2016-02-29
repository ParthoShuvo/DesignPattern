package adapterDesignPattern;

import adapterDesignPatternHelper.Duck;
import adapterDesignPatternHelper.Turkey;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Turkey is quacking");
		turkey.gobble();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

}
