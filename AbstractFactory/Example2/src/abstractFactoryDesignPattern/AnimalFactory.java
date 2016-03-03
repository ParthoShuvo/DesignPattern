package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.Animal;

public abstract class AnimalFactory {
	
	protected abstract Animal getAnimal(String type);
	
}
