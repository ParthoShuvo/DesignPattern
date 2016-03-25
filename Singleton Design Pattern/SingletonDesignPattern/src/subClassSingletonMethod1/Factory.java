package subClassSingletonMethod1;

public abstract class Factory {

	private static Factory factory = null;

	protected Factory() {
		// TODO Auto-generated constructor stub
	}

	public static Factory getInstance(String type) {
		if (factory == null) {
			if (type.equalsIgnoreCase("Cake")) {
				factory = new CakeFactory();
			} else if (type.equals("Chocolate")) {
				factory = new ChocolateFactory();
			} 
		}
		/*
		 * try { if (factory == null) { if (type.equalsIgnoreCase("Cake")) {
		 * factory = (CakeFactory)
		 * Class.forName("subClassSingletonMethod1.CakeFactory").newInstance();
		 * } else if (type.equals("Chocolate")) { factory = (ChocolateFactory)
		 * Class.forName("subClassSingletonMethod1.ChocolateFactory").
		 * newInstance(); } } } catch (InstantiationException |
		 * IllegalAccessException | ClassNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		return factory;
	}

	
}
