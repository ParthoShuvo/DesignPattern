package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.AbstractAnimalFactory;
import abstractFactoryDesignPattern.AbstractFactoryMaker;
import abstractFactoryDesignPattern.Animal;

public class DemoTest {

	public static void main(String[] args) {
		AbstractFactoryMaker abstractFactoryMaker = new AbstractFactoryMaker();
		AbstractAnimalFactory factory1 = abstractFactoryMaker
				.getAnimalFactory("Sea Animal");
		Animal animal = factory1.getAnimal("Shark");
		animal.speak();
		animal = factory1.getAnimal("Octupus");
		animal.speak();
		AbstractAnimalFactory factory2 = abstractFactoryMaker
				.getAnimalFactory("Land Animal");
		animal = factory2.getAnimal("Dog");
		animal.speak();
		animal = factory2.getAnimal("Lion");
		animal.speak();
		animal = factory2.getAnimal("Duck");
		animal.speak();
	}
	
}
