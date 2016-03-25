package SingletonDesignPattern;

public class DuckThread implements Runnable {

	private String type;
	private Duck duck = null;

	public DuckThread(String type) {
		this.type = type;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (type.equalsIgnoreCase("Donald Duck")) {
			duck = Duck.getInstance(type);
		} else if (type.equalsIgnoreCase("Goofy Duck")) {
			duck = Duck.getInstance(type);
		}
		System.out.println(duck);
	}

}