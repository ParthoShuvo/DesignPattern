package example2;

public abstract class CarDecorator implements Car {

	protected Car car;

	protected CarDecorator(Car car) {
		this.car = car;
	}

	@Override
	public Car manufactureCar() {
		// TODO Auto-generated method stub
		return car.manufactureCar();
	}

}