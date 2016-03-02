package factoryDesignPattern;

public class Factory {

	public Shape makeShape(String choice) {
		Shape shape = null;
		switch (choice.toUpperCase()) {
		case "SQUARE":
			shape = new Square();
			break;
		case "RECTANGLE":
			shape = new Rectangular();
			break;
		case "CIRCLE":
			shape = new Circle();
			break;
		default:
			break;
		}
		return shape;
	}

}
