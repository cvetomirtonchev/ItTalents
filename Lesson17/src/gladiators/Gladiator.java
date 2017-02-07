package gladiators;

import java.util.Random;

public class Gladiator {

	private final String name;
	private int health = 100;
	private int damage = 6;
	private static final int DODGE_PERCENT = 30;
	private static final int BLOCK_PERCENT = 30;
	private int dodges = 0;
	private int blocks = 0;
	private int maxHealth;
	
	public Gladiator(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
		else{
			this.name = "Phantom";
		}
		this.maxHealth = 100;
	}
	
	public Gladiator(String name, int health, int dmg) {
		this(name);
		if(health > 0){
			this.health = health;
			this.maxHealth = health;
		}
		if(dmg > 0) {
			this.damage = dmg;
		}
	}
	
	public void hit(Gladiator enemy){
		//if dodge - no dmg
		if(new Random().nextInt(100) < DODGE_PERCENT){
			System.out.println(this.name + " hits " + enemy.name + " for " + this.damage + " damage. "+ enemy.name + " DODGES and is left with " + enemy.health +" health.");
			enemy.dodges++;
		}
		else
		//if block - half dmg
		if(new Random().nextInt(100) < BLOCK_PERCENT){
			enemy.health -= this.damage/2;
			System.out.println(this.name + " hits " + enemy.name + " for " + this.damage + " damage. "+ enemy.name + " BLOCKS and is left with " + enemy.health +" health.");
			enemy.blocks++;
		}
		//if none - full dmg
		else{
			enemy.health -= this.damage;
			System.out.println(this.name + " hits " + enemy.name + " for " + this.damage + " damage. "+ enemy.name + " is left with " + enemy.health +" health.");
		}
	}
	
	boolean isDead(){
		return this.health <= 0;
	}

	public String getName() {
		return this.name;
	}

	public void printInfo() {
		System.out.println(this.name + " has " + this.dodges + " dodges and " + this.blocks + " blocks");
	}
	
	public void revive(){
		health = maxHealth;
	}
}
