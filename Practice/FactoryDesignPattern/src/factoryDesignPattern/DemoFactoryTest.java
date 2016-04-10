package factoryDesignPattern;

import java.util.Scanner;

public class DemoFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = null;
		Scanner scanner = new Scanner(System.in);
		String animalName = null;
		AnimalFactory animalFactory = new AnimalFactory();
		for (int i = 0; i < 3; i++) {
			animalName = scanner.nextLine();
			animal = animalFactory.getAnimal(animalName);
			if (animal == null) {
				System.out.println("Please input correct name");
			} else {
				animal.speak();
			}
		}
	}

}