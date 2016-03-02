package factoryDesignPattern;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args){
		EnemyShipFactory factory = new EnemyShipFactory();
		Scanner scanner = new Scanner(System.in);
		String choice;
		System.out.print("Choice B/U/R");
		choice = scanner.nextLine();
		EnemyShip enemyShip = factory.makeEnemyShip(choice);
		showResult(enemyShip);
	}
	
	public static void showResult(EnemyShip enemyShip){
		enemyShip.followHeroShip();
		enemyShip.displayEnemyShip();
		enemyShip.displayEnemyShip();
	}
}
