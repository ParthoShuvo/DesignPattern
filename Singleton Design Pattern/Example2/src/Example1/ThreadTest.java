package Example1;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuckThread thread1 = new DuckThread("Donald Duck");
		DuckThread thread2 = new DuckThread("Goofy Duck");
		Thread t1 = new Thread(thread1);
		t1.setPriority(4);
		Thread t2 = new Thread(thread2);
		t2.setPriority(6);
		t1.start();
		t2.start();
		
		
	}

}
