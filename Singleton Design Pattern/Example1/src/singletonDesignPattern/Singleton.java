package singletonDesignPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton singleton = null;
	public static boolean firstThread = true;

	String[] scrabbleLetters = { "a", "a", "a", "a", "b", "b", "c", "b", "b", "b", "c", "c", "c", "c", "c", "c", "d",
			"d", "d", "d", "e", "e", "e", "e", "e", "f", "f", "f", "f", "g", "h", "i", "j", "j", "k", "k", "l", "l",
			"m", "m", "m", "m", "n", "n", "o", "o", "p", "p", "q", "r", "s", "t", "u", "v", "w", "w", "w", "w", "x",
			"x", "x", "y", "y", "z" };
	private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

	private Singleton() {

	}

	public static Singleton getSingleton() {
		synchronized (Singleton.class) {
			if (singleton == null) {
				if (firstThread) {
					firstThread = false;
					Thread.currentThread();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				singleton = new Singleton();
				Collections.shuffle(singleton.letterList);
			}
		}
		return singleton;
	}

	public LinkedList<String> getLetterList() {
		return singleton.letterList;
	}

	public LinkedList<String> getTiles(int howMnayTiles) {
		LinkedList<String> tiles = new LinkedList<>();
		for (int i = 0; i < howMnayTiles; i++) {
			tiles.add(letterList.remove(0));
		}
		return tiles;
	}

}
