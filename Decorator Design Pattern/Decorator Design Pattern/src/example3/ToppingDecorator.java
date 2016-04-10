package example3;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza pizza;
	
	protected ToppingDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost();
	}

}
