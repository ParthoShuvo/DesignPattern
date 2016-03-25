package lazyInstantiation;

public class TestThread extends Thread {
	
	int data;
	
	public TestThread() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
		Singleton singleton = Singleton.getInstance();
		singleton.setData(getData());
		System.out.println(singleton.getData());
		singleton = null;
		singleton = Singleton.getInstance();
		System.out.println(singleton.getData());
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
