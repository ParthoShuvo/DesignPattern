package abstractFactoryDesignPattern;

public abstract class EnemyShipBuilding {
	
	protected abstract EnemyShip makeEnemyShip(String type);
	
	public EnemyShip orderEnemyShip(String type){
		EnemyShip enemyShip = makeEnemyShip(type);
		enemyShip.makeShip();
		enemyShip.followHeroShip();
		enemyShip.displayEnemy();
		enemyShip.enemyShipShoot();
		return enemyShip;
	}
}
