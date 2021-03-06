package abstractFactoryDesignPattern;

public final class FactoryMaker {

	public AnimalFactory getFactory(String factoryType) {
		AnimalFactory factory = null;
		if (factoryType.equalsIgnoreCase("Land Animal")) {
			factory = new LandAnimalFactory();
		} else if (factoryType.equalsIgnoreCase("Sea Animal")) {
			factory = new SeaAnimalFactory();
		}
		return factory;
	}
}
