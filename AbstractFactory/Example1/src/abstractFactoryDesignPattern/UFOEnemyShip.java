package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {

	private EnemyShipFactory shipFactory;
	

	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.shipFactory = shipFactory;
	}



	@Override
	protected void makeShip() {
		System.out.println("Making enemy ship");
		setEngine(shipFactory.addEngine());
		setWeapon(shipFactory.addWeapon());
	}

}
