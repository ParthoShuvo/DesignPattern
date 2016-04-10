package abstractFactoryDesignPattern;

public class LandAnimalFactory extends AbstractAnimalFactory {


	@Override
	protected Animal getAnimal(String name) {
		Animal animal = null;
		switch (name.toUpperCase()) {
		case "LION":
			animal = new Lion();
			break;
		case "DOG":
			animal = new Dog();
			break;
		case "DUCK":
			animal = new Duck();
			break;
		default:
			break;
		}
		return animal;
	}
}