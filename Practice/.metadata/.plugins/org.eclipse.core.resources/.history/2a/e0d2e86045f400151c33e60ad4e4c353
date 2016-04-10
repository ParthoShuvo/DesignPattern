package abstractFactoryDesignPattern;

public class AbstractFactoryMaker {

	public AbstractAnimalFactory getAnimalFactory(String fatoryName) {
		AbstractAnimalFactory factory = null;
		if (fatoryName.equalsIgnoreCase("Sea Animal")) {
			factory = new SeaAnimalFactory();
		} else if (fatoryName.equals("Land Animal")) {
			factory = new LandAnimalFactory();
		}
		return factory;
	}
}
