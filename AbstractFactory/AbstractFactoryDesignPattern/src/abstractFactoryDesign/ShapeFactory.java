package abstractFactoryDesign;

import abstractDesignPatternHelper.Color;
import abstractDesignPatternHelper.Shape;
import concreteClasses.Circle;
import concreteClasses.Rectangle;
import concreteClasses.Square;

public class ShapeFactory extends AbstractFactory {

	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		Shape shape = null;
		switch (shapeType.toUpperCase()) {
		case "CIRCLE":
			shape = new Circle();
			break;
		case "RECTANGLE":
			shape = new Rectangle();
			break;
		case "SQUARE":
			shape = new Square();
			break;

		default:
			break;
		}
		return shape;
	}

}
