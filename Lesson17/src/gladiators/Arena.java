package gladiators;

import java.util.Random;

public class Arena {

	public static void main(String[] args) {
		
		Gladiator vlado1 = new Gladiator("Vlado 1", 100, 10);
		
		Gladiator maria = new Gladiator("Maria", 100, 10);
		
		int mariaWins = 0;
		int vladosWins = 0;
		
		for (int i = 0; i < 1; i++) {
			int counter = 1;
			while(true){
				System.out.println("round " + counter++);
				if(new Random().nextBoolean()){//50%
					maria.hit(vlado1);
					
					if(vlado1.isDead()){
						System.out.println(maria.getName() + " WINS");
						mariaWins++;
						break;
					}
					vlado1.hit(maria);
					
					if(maria.isDead()){
						System.out.println(vlado1.getName()  + " WIN");
						vladosWins++;
						break;
					}
				}
				else{
					vlado1.hit(maria);
				
					if(maria.isDead()){
						System.out.println(vlado1.getName()  + " WIN");
						vladosWins++;
						break;
					}
					maria.hit(vlado1);
					
					if(vlado1.isDead() ){
						System.out.println(maria.getName() + " WINS");
						mariaWins++;
						break;
					}
				}
			}
			maria.revive();
			vlado1.revive();
			
		}
		maria.printInfo();
		vlado1.printInfo();
		
		System.out.println("Maria wins: " + mariaWins);
		System.out.println("Vlados wins: " + vladosWins);
	}
}
