import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter - Heads or Tails");
		String headsNtails = sc.next();
	    String headss= "Heads";
		String tealss="Teals";
		boolean heads3= headsNtails.equals(headss);
		boolean teals3 = headsNtails.equals(tealss);
		int heads4=0;
		int tails4=0;
		if(heads3==true){
			heads4+=1;
		}
		int counter=0;
		int counterFives =0;
		for (int i = 0; i < counter+1; i++) {
			Random toss = new Random();
			heads4=toss.nextInt(1);
			counter++;
			if(heads4==1){
				counterFives++;
				
				if (counterFives == 5){
					break;
					
				}
			}
			else {
				counterFives = 0;
			}
			
		}
		System.out.println(counter);
		
		
		
	}
}
