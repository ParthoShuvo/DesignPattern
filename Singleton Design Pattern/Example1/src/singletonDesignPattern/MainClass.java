package singletonDesignPattern;

import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		Singleton instanceOne = Singleton.getSingleton();
		System.out.println("Instance ID: " + System.identityHashCode(instanceOne));
		System.out.println(instanceOne.getLetterList());
		LinkedList<String> playerOneTiles = instanceOne.getTiles(7);
		System.out.println("Player 1" + playerOneTiles);
		System.out.println(instanceOne.getLetterList());
		Singleton instanceTwo = Singleton.getSingleton();
		System.out.println("Instance ID: " + System.identityHashCode(instanceTwo));
		System.out.println(instanceOne.getLetterList());
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		System.out.println("Player 2" + playerTwoTiles);
		
		

	}

}
