package example1;

public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	protected ShapeDecorator(Shape shape) {
		// TODO Auto-generated constructor stub
		this.shape = shape;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

}
