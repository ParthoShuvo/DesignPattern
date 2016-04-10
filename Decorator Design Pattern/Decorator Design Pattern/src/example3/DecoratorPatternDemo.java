package example3;

public class DecoratorPatternDemo {

	public static void main(String[] args) {

		ToppingDecorator decorator = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Description: " + decorator.getDescription());
		System.out.println("Cost: " + decorator.getCost());

	}

}
