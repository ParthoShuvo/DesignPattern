package abstractFactoryDesignPatternHelper;

public class BigUFOShipFactory implements EnemyShipFactory {

	@Override
	public ESEngine addEngine() {
		// TODO Auto-generated method stub
		return new ESBigUFOEngine();
	}

	@Override
	public ESWeapon addWeapon() {
		// TODO Auto-generated method stub
		return new ESBigUFOWeapon();
	}

}
