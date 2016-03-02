package factoryDesignPattern;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	protected EnemyShip() {
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getDamage() {
		return amtDamage;
	}

	protected void setDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	protected void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	protected void displayEnemyShip(){
		System.out.println(getName() + " is on the screen"); 
	}
	
	protected void enemyShipShots(){
		System.out.println(getName() + " attacks and does " + getDamage());
	}

}
