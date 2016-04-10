package example1;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Shape shape = new Circle();
		Shape decorator1 = new RedShapeDecorator(shape);
		decorator1.draw();
		shape = new Rectangle();
		Shape decorator2 = new RedShapeDecorator(shape);
		decorator2.draw();

	}

}
