
public class Call {
	float priceForAMinute = 0.00f;
	Gsm caller;
	Gsm reciver;
	int duration;
	
	
	void call(Gsm reciver,int duration1){
		if(duration1<=duration){
			if(reciver.equals(caller)){
				System.out.println("Imposible to call yourself");
			}
			else{
				if(caller.hasSimCard==true&&reciver.hasSimCard==true){
					reciver.lastOutGoingCall= caller.simMobileNumber ;
					caller.lastIncomingCall = reciver.simMobileNumber;
					caller.outGoingCallsDuration+=duration1;
					
				}
				else{
					System.out.println("No sim");
				}
			}
			}
		}
		
	
	void getSumForCall(){
		float priceForATalk = priceForAMinute;
		priceForATalk = (float)(priceForATalk*caller.outGoingCallsDuration);
		System.out.println(priceForATalk + " Leva");
	}
	

}
