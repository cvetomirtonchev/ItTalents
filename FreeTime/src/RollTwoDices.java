import java.util.Random;

public class RollTwoDices {

	public static void main(String[] args) {
		// First write code for two dices
		Random dice = new Random();
	    int number1;
		int number2;
		int counter = 0;
		int counterSevens = 0;
		for (int i = 0; i < counter+1; i++) {
			number1 = 1+dice.nextInt(6);
			number2 = 1+dice.nextInt(6);
			counter++;
			if(number1+number2==7){
				counterSevens++;
				
				if (counterSevens == 7){
					break;
					
				}
			}
			else {
				counterSevens = 0;
			}
			
		}
		System.out.println(counter);
		
		
		
		
		// check the sum of their values
		// chek if their sum is 7
		// chek next 

	}

}
