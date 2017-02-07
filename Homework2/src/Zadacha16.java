import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Zadacha16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number :");
		int n = sc.nextInt();
		System.out.println("Enter your second number");
		int m = sc.nextInt();
		         if ( n<5555&&n>10&&m<5555&&m>10){
		        	 for ( int i = n;i>m;i--){
		        		 if (i%50==0){
		        			 System.out.print(i+" ");
		        		 }
		        	 }
		        	 for ( int i = m;i>n;i--){
		        		 if (i%50==0){
		        			 System.out.print(i+" ");
		        		 }
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		        	 
		         }

	}

}}
