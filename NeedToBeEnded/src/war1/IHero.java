package war1;

public interface IHero {
	int CHANCE_TO_BLOCK = 20;
	int CHANCE_TO_DODGE = 10;
	int CHANCE_TO_CRIT = 30;
	
	void atack();
	void strikeWithMagic();
	void strikeWithWeapon();
	void heal();
	void isDead();
	void revive();

}
