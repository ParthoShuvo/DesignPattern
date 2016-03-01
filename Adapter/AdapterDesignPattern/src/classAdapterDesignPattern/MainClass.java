package classAdapterDesignPattern;

import adapterDesignPatternHelper.Duck;
import objectAdapterDesignPattern.MallardDuck;
import objectAdapterDesignPattern.WildTurkey;

public class MainClass {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		System.out.println("Duck is");
		mallardDuck.quack();
		mallardDuck.fly();
		WildTurkey turkey = new WildTurkey();
		System.out.println("Turkey is ");
		turkey.gobble();
		turkey.fly();
		Duck duck = new TurkeyAdapter();
		System.out.println("The adapted turkey can ");
		duck.quack();
		duck.fly();

	}

}
