package abstractFactoryDesignPattern;

import abstractFactoryDesignPatternHelper.ESEngine;
import abstractFactoryDesignPatternHelper.ESWeapon;

public abstract class EnemyShip {

	private ESWeapon weapon;
	private ESEngine engine;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public ESWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(ESWeapon weapon) {
		this.weapon = weapon;
	}

	public ESEngine getEngine() {
		return engine;
	}

	public void setEngine(ESEngine engine) {
		this.engine = engine;
	}

	protected abstract void makeShip();

	protected void followHeroShip() {
		System.out.println(getName() + " is following the hero at " + engine);
	}

	protected void displayEnemy() {
		System.out.println(getName() + " is on the screen");

	}

	protected void enemyShipShoot() {
		System.out.println(getName() + " attacks and does " + weapon);
	}

	@Override
	public String toString() {
		String infoOnShip = "The " + name + " has a top speed of " + engine + " and an attack power of " + weapon;

		return infoOnShip;
	}

}
