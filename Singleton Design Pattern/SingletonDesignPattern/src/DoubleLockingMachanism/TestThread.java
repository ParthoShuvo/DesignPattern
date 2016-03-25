package DoubleLockingMachanism;

public class TestThread extends Thread{

	
	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		
	}
}
