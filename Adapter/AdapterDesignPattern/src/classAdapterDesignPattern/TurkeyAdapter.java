package classAdapterDesignPattern;

import adapterDesignPatternHelper.Duck;
import objectAdapterDesignPattern.WildTurkey;

public class TurkeyAdapter extends WildTurkey implements Duck {

	public TurkeyAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void quack() {
		System.out.println("quacking quacking ........");
		gobble();

	}

}
