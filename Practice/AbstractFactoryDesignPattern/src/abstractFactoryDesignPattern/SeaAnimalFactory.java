package abstractFactoryDesignPattern;

public class SeaAnimalFactory extends AbstractAnimalFactory{
	
	protected SeaAnimalFactory(){
		
	}

	@Override
	protected Animal getAnimal(String name) {
		Animal animal = null;
		switch (name.toUpperCase()) {
		case "SHARK":
			animal = new Shark();
			break;
		case "OCTUPUS":
			animal = new Octupus();
			break;
		default:
			break;
		}
		return animal;
	}
	
	

}
