package example2;

public class DieselCarDecorator extends CarDecorator {

	protected DieselCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car manufactureCar() {
		super.car.manufactureCar();
		addEngine(super.car);
		return super.car;
	}

	private void addEngine(Car car) {
		if (car instanceof BMWCar) {
			BMWCar bmwCar = (BMWCar) car;
			bmwCar.setEngine("Diesel Engine");
			System.out.println("Diesel engine has been added");
			System.out.println(bmwCar.toString());
		}
	}

}
