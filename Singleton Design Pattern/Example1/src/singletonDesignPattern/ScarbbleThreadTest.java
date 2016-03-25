package singletonDesignPattern;

public class ScarbbleThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable threadOne = new ScrabbleThread();
		Runnable threadTwo = new ScrabbleThread();
		new Thread(threadOne).start();
		new Thread(threadTwo).start();
	}

}
