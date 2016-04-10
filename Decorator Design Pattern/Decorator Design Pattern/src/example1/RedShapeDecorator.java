package example1;

public class RedShapeDecorator extends ShapeDecorator {

	protected RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		super.shape.draw();
		setRedBorder();
	}

	private void setRedBorder() {
		System.out.println("Border color: red");
	}
}
