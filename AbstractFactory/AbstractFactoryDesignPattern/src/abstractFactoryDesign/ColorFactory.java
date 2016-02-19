package abstractFactoryDesign;

import abstractDesignPatternHelper.Color;
import abstractDesignPatternHelper.Shape;
import concreteClasses.Blue;
import concreteClasses.Green;
import concreteClasses.Red;

public class ColorFactory extends AbstractFactory {

	public ColorFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	Color getColor(String colorType) {
		Color color = null;
		switch (colorType.toUpperCase()) {
		case "RED":
			color = new Red();
			break;
		case "BLUE":
			color = new Blue();
			break;
		case "GREEN":
			color = new Green();
			break;

		default:
			break;
		}
		return color;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
