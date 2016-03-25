package eagerInstantiation;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread thread1 = new TestThread();
		TestThread thread2 = new TestThread();
		thread2.setData(30);
		thread1.start();
		thread2.start();
		
	}

}
