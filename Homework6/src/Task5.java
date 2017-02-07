import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		int result = reverseNumber(number);
	    if (result == number){
	    	System.out.println(result + " "+"Yes");
	    }
	    else {
	    	System.out.println(result + " "+"No");
	    	
	    	
	    }

	}

	 static int reverseNumber(int x){
	        int rev1=x,rev2=1;
	        if(x<10){
	            return x;
	        }
	        while(rev1>=10){
	            rev2*=10;
	            rev1/=10;
	        }
	        if(((x%rev2) < (rev2/10))&& x%rev2!=0){
	            int c=rev2;
	            while(c> x%rev2){
	                c/=10;
	            }
	            c=rev2/c;
	            rev2=x%rev2;
	            return((rev1)+(c*reverseNumber(rev2)));
	        }
	        rev2=x%rev2;

	        return (rev1+(10*reverseNumber(rev2)));

	    }

		
	 }


