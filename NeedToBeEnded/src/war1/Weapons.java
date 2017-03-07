package war1;

public abstract class Weapons {
	private final String name ;
	private final int damage;
	
	
	
	public Weapons(String name, int damage) {
		this.name = name;
		if(damage<=40){
			this.damage = damage;
		}
		else{
			this.damage = 20;
		}
		
	}
	

}
