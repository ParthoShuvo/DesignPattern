package lazyInstantiation;

public class Singleton {
	
	private static Singleton singleton = null;
	private int data;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	private Singleton(){
		System.out.println("New instance has been created");
	}
	
	public synchronized static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
}
