package MortalCombat;

import java.util.Random;

public class Character {
	private String name;
	private int health;
	private int punchDamage;
	private int kickDamage;
	private boolean isDead;
	private static final boolean CHANCE_TO_PUNCH = true;
	private static final boolean CHANCE_TO_KICK = false;
	private static final int CHANCE_TO_DODGE = 30;
	private static final int CHANCE_TO_BLOCK = 30;
	static final int CHANCE_TO_GET_WEAPON = 20;
	private static final int CHANCE_TO_CAST_SPELL = 20;
	private Spells spell;
	private Weapons weapon;
	private int counterForWeapon = 1;
    private int tempForPunch;
	public Character(String name, int health, int punchDamgae, int kickDamage) {

		this.name = name;
		this.health = health;
		this.punchDamage = punchDamgae;
		this.kickDamage = kickDamage;
		this.tempForPunch = punchDamage;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	void hit(Character enemy) {
		if (new Random().nextBoolean() == CHANCE_TO_PUNCH) {

			if (new Random().nextInt(100) < CHANCE_TO_DODGE) {
				System.out.println(enemy.name + " dodges " + this.name + "atack!");

			} else {
				if (new Random().nextInt(100) < CHANCE_TO_BLOCK) {
					enemy.health -= (this.punchDamage / 2);
					System.out.println(enemy.name + " blocked " + this.name + " atack!" + enemy.name + " left with "
							+ enemy.health + "health");

				} else {
					enemy.health -= this.punchDamage;
					System.out.println(this.name + " punch " + enemy.name + " and take him " + this.punchDamage
							+ " damage " + enemy.name + " left with " + enemy.health + "health");
				}
			}

		}

		else {
			if (new Random().nextInt(100) < CHANCE_TO_DODGE) {
				System.out.println(enemy.name + " dodges " + this.name + " atack! ");

			} else {
				if (new Random().nextInt(100) < CHANCE_TO_BLOCK) {
					enemy.health -= (this.kickDamage / 2);
					System.out.println(enemy.name + " blocked " + this.name + " atack! " + " and left with "
							+ enemy.health + " health");
				}

				else {
					enemy.health -= this.kickDamage;
					System.out.println(this.name + " kicked " + enemy.name + " and take him " + this.kickDamage
							+ " damage! " + enemy.name + " left him with " + enemy.health + "health");
				}
			}

		}

	}

	boolean isDead() {
		return this.health <= 0;
	}
	void getWeapon(Weapons a) {
		if(counterForWeapon<=3){
		this.punchDamage = a.getDamage();
		counterForWeapon++;
		}
		else{
			this.punchDamage = tempForPunch;
		}
	}


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
