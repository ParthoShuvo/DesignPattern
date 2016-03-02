package factoryDesignPattern;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip enemyShip = null;
		switch (newShipType) {
		case "B":
			enemyShip = new BigUFOEnemyShip();
			break;
		case "U":
			enemyShip = new UFOEnemyShip();
			break;
		case "R":
			enemyShip = new RocketEnemyShip();
			break;
		default:
			break;
		}
		return enemyShip;	
		
	}
	
}
