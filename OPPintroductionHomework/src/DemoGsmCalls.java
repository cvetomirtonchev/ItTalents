import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

public class DemoGsmCalls {

	public static void main(String[] args) {
		Gsm gsm1 = new Gsm();
		gsm1.model = "Iphone 5s";
		gsm1.hasSimCard=false;
		gsm1.simMobileNumber = "";
		gsm1.outGoingCallsDuration = 0;
		gsm1.lastIncomingCall = "";
		gsm1.lastOutGoingCall = "";
		
		
		Gsm gsm2 = new Gsm();
		gsm2.model = "Iphone 6s";
		gsm2.hasSimCard=false;
		gsm2.simMobileNumber = null;
		gsm2.outGoingCallsDuration =0;
		gsm2.lastIncomingCall = "";
		gsm2.lastOutGoingCall = "";
		
		gsm1.insertSimCard("0887153765");
		gsm2.insertSimCard("0887365754");
		
		
		System.out.println(gsm1.simMobileNumber + " " +gsm1.hasSimCard);
		
		Call edno = new Call();
		edno.caller = gsm1;
		edno.duration=40;
		edno.reciver = gsm2;
		edno.priceForAMinute= 0.321f;
		
		edno.call(gsm2, 30);
		System.out.println(gsm2.lastOutGoingCall);
		System.out.println(gsm1.outGoingCallsDuration);
		edno.getSumForCall();
		gsm1.prinlnLastInComingCall();
		gsm2.prinlnLastOutGoingCall();
		
	
	    
		
		
		
		
		
		

	}

}
