import java.util.Scanner;

public class Zadacha18 {
	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter your first number:");
	    a = sc.nextInt();
	    System.out.println("Enter your second number");
	    b = sc.nextInt();
	    
	    if ( a<=9&&a>=1&&b<=9&&b>=1){
	    	
	    	for ( int i = 1; i<=a;i++){
	    		for (int g =1; g<=b;g++){
	    		     
	    			if (i*g<=a+b){
	    	
	    			System.out.println(i + "*" + g + " = " + i*g);}
	    			
	    			
	    		}
	 }
	    	
	    	
	    }
}}