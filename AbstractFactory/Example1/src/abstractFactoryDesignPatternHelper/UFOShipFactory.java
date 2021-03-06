package abstractFactoryDesignPatternHelper;

public class UFOShipFactory implements EnemyShipFactory {

	@Override
	public ESEngine addEngine() {
		return new ESUFOEngine();
	}

	@Override
	public ESWeapon addWeapon() {
		return new ESUFOWeapon();
	}

}
