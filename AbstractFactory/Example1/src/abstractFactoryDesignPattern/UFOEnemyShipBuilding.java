package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.BigUFOShipFactory;
import abstractFactoryDesignPatternHelper.EnemyShipFactory;
import abstractFactoryDesignPatternHelper.UFOShipFactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String type) {
		EnemyShip enemyShip = null;
		if(type.equals("UFO")){
		   EnemyShipFactory shipPartsFactory = new UFOShipFactory();
		   enemyShip = new UFOEnemyShip(shipPartsFactory);
		   enemyShip.setName("UFO Grunt Ship");
		}          
		else if(type.equals("UFO BOSS")){
			EnemyShipFactory shipPartsFactory = new BigUFOShipFactory();
			enemyShip = new BigUFOEnemyShip(shipPartsFactory);
			enemyShip.setName("UFO Boss Ship");
		}   
	        return enemyShip;
		
	}

}
