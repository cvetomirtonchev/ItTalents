package MortalCombat;

import java.util.Random;

public class Arena {
	public static void main(String[] args) {

		Character scorpion = new Character("Scorpion", 100, 10, 20);
		Character subzero = new Character("Sub-zero", 100, 10, 20);
		Weapons mech = new Weapons("Mech",40);
		
		
		
		int counter = 1;

		while (true) {
			System.out.println("Round: " + counter++);
			if(new Random().nextBoolean()){
				subzero.hit(scorpion);
				if(scorpion.isDead() ){
					System.out.println(subzero.getName() + " WINS");
					
					break;
				}
				scorpion.hit(subzero);
				if(subzero.isDead()){
					System.out.println(scorpion.getName() +  " WIN");
					
					break;
				}
				
				
			}
			else{
				scorpion.hit(subzero);
					if(subzero.isDead()){
						System.out.println(scorpion.getName() +  " WIN");
						
						break;
					}
				subzero.hit(scorpion);
				if(scorpion.isDead() ){
					System.out.println(subzero.getName() + " WINS");
					
					break;
				}
				
					
				
				}
			}
			
			

		
	}
}
