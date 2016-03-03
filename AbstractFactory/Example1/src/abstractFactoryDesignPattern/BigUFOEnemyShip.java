package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.EnemyShipFactory;

public class BigUFOEnemyShip extends EnemyShip {

private EnemyShipFactory shipFactory;
	

	public BigUFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}
	
	@Override
	protected void makeShip() {
		// TODO Auto-generated method stub
		System.out.println("Making enemy ship");
		setEngine(shipFactory.addEngine());
		setWeapon(shipFactory.addWeapon());
	}

}
