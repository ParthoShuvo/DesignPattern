package example3;

public class Mozzarella extends ToppingDecorator {

	protected Mozzarella(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding dough");
		System.out.println("Adding moz");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", mozzarella";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 0.50;
	}

}
