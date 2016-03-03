package abstractFactoryDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		EnemyShipBuilding shipBuilder = new UFOEnemyShipBuilding();
		shipBuilder.orderEnemyShip("UFO");
		shipBuilder.orderEnemyShip("UFO BOSS");

	}

}
