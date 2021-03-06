package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.Animal;
import abstractFactoryDesignPatternHelper.Cat;
import abstractFactoryDesignPatternHelper.Dog;
import abstractFactoryDesignPatternHelper.Lion;

public class LandAnimalFactory extends AnimalFactory {

	public LandAnimalFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Animal getAnimal(String type) {
		Animal animal = null;
		switch (type.toUpperCase()) {
		case "CAT":
			animal = new Cat();
			break;
		case "DOG":
			animal = new Dog();
			break;
		case "LION":
			animal = new Lion();
			break;
		default:
			break;
		}
		return animal;
	}

}
