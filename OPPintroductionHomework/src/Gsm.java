import java.util.concurrent.SynchronousQueue;

public class Gsm {
	String model;
	boolean hasSimCard = false;
	String simMobileNumber = "";
	int outGoingCallsDuration;
	String lastIncomingCall;
	String lastOutGoingCall;
	

	void insertSimCard(String newSimMobileNumber) {
		String numbers = "0123456789";
		String[] simNumbers = newSimMobileNumber.split("");
		String[] posibleNumbers = numbers.split("");
		boolean posible = false;
		int counter = 0;
		while (posible==false) {
			if (simNumbers[0].equals(posibleNumbers[0]) ) {
				
				if (simNumbers[1].equals(posibleNumbers[8])) {
					for (int i = 0; i <= simNumbers.length-1; i++) {
						for (int j = 0; j <= 9; j++) {
							if (simNumbers[i].equals(posibleNumbers[j])) {
								counter++;
							}

						}
					}

				}

			}
			if (counter == 10) {
				simMobileNumber = newSimMobileNumber;
				hasSimCard = true;
				posible = true;
			} else {
				posible= true;
				System.out.println("Invalid number");
				
			
			}

		}
	}

	void removeSimCard() {
		hasSimCard = false;
		simMobileNumber= null;

	}
	void prinlnLastOutGoingCall(){
		if(lastOutGoingCall.equals("")){
			System.out.println("You don't call anyone");
		}
		else{
			System.out.println(lastOutGoingCall);
		}
		
	}
	void prinlnLastInComingCall(){
		if(lastIncomingCall.equals("")){
			System.out.println("No one calls you");
		}
		else{
			System.out.println(lastIncomingCall);
		}
	}

}
