package Example1;

public abstract class Duck {

	private String name;
	protected static Duck duck = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected Duck() {

	}

	protected static Duck getInstance(String type) {
		return null;
	}

}
