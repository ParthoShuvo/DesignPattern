package subClassSingletonMethod1;

public class MainClass {
	public static void main(String[] args) {
		Factory factory = Factory.getInstance("Cake");
		factory = Factory.getInstance("Chocolate");
		/**
		 * note that the constructor of Cake factory and Chocolate factory both
		 * are not private
		 */
		factory = new ChocolateFactory();
	}
}
