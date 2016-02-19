package abstractFactoryDesign;

import abstractDesignPatternHelper.Color;
import abstractDesignPatternHelper.Shape;

public abstract class AbstractFactory {
	
	abstract Color getColor(String colorType);
	abstract Shape getShape(String shapeType);
}
