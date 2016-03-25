package DoubleLockingMachanism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new TestThread();
		Thread t2 = new TestThread();
		t1.start();
		t2.start();
	}

}
