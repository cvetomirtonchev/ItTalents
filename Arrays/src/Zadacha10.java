import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[7];
		for (int i = 0;i<arr.length;i++){
			System.out.print("Enter array number :"+ i +":");
			int n = sc.nextInt();
			arr[i]=n;
		}
        int sum = 0;
        int avr = 0;
        for (int i = 0; i<arr.length;i++){
        	sum = sum+arr[i];
        	
        }
	    System.out.print("Average sum is:" + sum/arr.length + " " );
	    System.out.println("The closser number is :"+arr[sum/arr.length-1]);
	}
	

}
