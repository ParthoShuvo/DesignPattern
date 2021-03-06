package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.Animal;
import abstractFactoryDesignPatternHelper.Cat;
import abstractFactoryDesignPatternHelper.Dog;
import abstractFactoryDesignPatternHelper.Lion;
import abstractFactoryDesignPatternHelper.Octopus;
import abstractFactoryDesignPatternHelper.Shark;

public class SeaAnimalFactory extends AnimalFactory{

	@Override
	protected Animal getAnimal(String type) {
		Animal animal = null;
		switch (type.toUpperCase()) {
		case "OCTOPUS":
			animal = new Octopus();
			break;
		case "SHARK":
			animal = new Shark();
			break;
		default:
			break;
		}
		return animal;
	}
	
}
