package MortalCombat;

public class Weapons {

	private final String name;
	private final int damage;
	

	
	
	public Weapons(String name, int damage) {
		if(!name.isEmpty()){
		   this.name = name;
		}
		else{
			this.name = "mech";
		}
		if(damage<0)
		  this.damage=30;
		else{
			this.damage= damage;
		}
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public int getDamage() {
		return damage;
	}
	
}
