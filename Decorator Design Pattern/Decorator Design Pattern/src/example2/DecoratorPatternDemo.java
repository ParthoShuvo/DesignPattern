package example2;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Car bmwCar1 = new BMWCar();
		System.out.println(bmwCar1 + "\n");
		DieselCarDecorator decorator1 = new DieselCarDecorator(bmwCar1);
		decorator1.manufactureCar();

		Car bmwCar2 = new BMWCar();
		PetrolCarDecorator decorator2 = new PetrolCarDecorator(bmwCar2);
		decorator2.manufactureCar();

	}

}
