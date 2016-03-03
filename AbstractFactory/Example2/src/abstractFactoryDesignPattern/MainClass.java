package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.Animal;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryMaker maker = new FactoryMaker();
		AnimalFactory factory = maker.getFactory("Land Animal");
		Animal animal = factory.getAnimal("Cat");
		animal.speak();
		animal = factory.getAnimal("Dog");
		animal.speak();
		animal = factory.getAnimal("Lion");
		animal.speak();
		factory = maker.getFactory("Sea Animal");
		animal = factory.getAnimal("Octopus");
		animal.speak();
		animal = factory.getAnimal("Shark");
		animal.speak();
		
	}

}
