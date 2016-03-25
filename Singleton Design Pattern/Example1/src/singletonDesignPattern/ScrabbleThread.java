package singletonDesignPattern;

import java.util.LinkedList;

public class ScrabbleThread implements Runnable {

	public ScrabbleThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		Singleton instanceOne = Singleton.getSingleton();
		System.out.println("Instance ID: " + System.identityHashCode(instanceOne));
		System.out.println(instanceOne.getLetterList());
		LinkedList<String> playerOneTiles = instanceOne.getTiles(7);
		System.out.println("Player 1" + playerOneTiles);

	}

}
