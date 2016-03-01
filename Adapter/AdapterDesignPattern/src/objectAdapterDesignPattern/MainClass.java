package objectAdapterDesignPattern;

import adapterDesignPatternHelper.Duck;

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
		Duck duck = new TurkeyAdapter(turkey);
		System.out.println("The adapted turkey can ");
		duck.quack();
		duck.fly();
	}
}
