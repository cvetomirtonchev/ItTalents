import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of the array: ");
		int size = sc.nextInt();
		while (size<=0){
			System.out.print("Enter positive number : ");
		}
        double[] arr = new double [size];
        for (int i = 0;i<arr.length;i++){
        	System.out.print("Enter real number for: "+"["+i+"]");
        	double num = sc.nextDouble();
        	arr[i]=num;
        }
	    for (int i = 0 ; i<arr.length;i++){
	    	double arr1 = -2.99;
	    	double arr2 = 2.99;
	    	
	    	if(arr[i]>arr1&&arr[i]<arr2){
	    		System.out.print(arr[i] + " ");
	    	}
	    }
	
	
	
	
	}
	

}
