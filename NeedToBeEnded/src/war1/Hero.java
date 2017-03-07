package war1;

public abstract class Hero implements IHero {
	private String name;
	private int health;
	private int weaponDamage;
	private int magicDamage;
	
	
	
	public Hero(String name, int health, int weaponDamage, int magicDamage) {
		
		this.name = name;
		this.health = health;
		this.weaponDamage = weaponDamage;
		this.magicDamage = magicDamage;
	}
	
	
	
	
	
	

}
