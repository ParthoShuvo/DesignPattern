package example2;

public class PetrolCarDecorator extends CarDecorator {

	protected PetrolCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car manufactureCar() {
		car.manufactureCar();
		addEngine(car);
		return car;
	}

	private void addEngine(Car car) {
		if (car instanceof BMWCar) {
			BMWCar bmwCar = (BMWCar) car;
			bmwCar.setEngine("Petrol Engine");
			System.out.println("Petrol engine has been added");
			System.out.println(bmwCar.toString());
		}
	}
}
