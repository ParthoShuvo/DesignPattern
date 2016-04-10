package example3;

public class TomatoSauce extends ToppingDecorator {

	protected TomatoSauce(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding tomato sauce");
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + ", Tomato Sauce";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + .50;
	}

}