import java.util.Scanner;

public class Zadacha15 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter the size of the array: ");
		int value = sc.nextInt();
		
		while(value <=0){
			
			System.out.print("Enter positive number: ");
			value = sc.nextInt();
		}
		
		double[] arr = new double[value];
		System.out.println("Please, enter the elements of the array: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextDouble();
		}
		
		//without using Math.abs
		double[] arr_copy = new double[arr.length];
		
		
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] < 0){
				arr_copy[i] = -(arr[i]);
			}
			else{
				arr_copy[i] = arr[i];
			}
		}
		
		double max = arr_copy[0];
		int index_max = 0;
		for(int i = 0; i < arr.length; i++){
			if(max < arr_copy[i]){
				max = arr_copy[i];
				index_max = i;
			}
		}
		
		double max1 = arr_copy[0];
		int index_max1 = 0;
		for(int i = 0; i < arr.length; i++){
			if(max1 < arr_copy[i] && max != arr_copy[i]){
				max1 = arr_copy[i];
				index_max1 = i;
			}
		}
		
		double max2 = arr_copy[0];
		int index_max2 = 0;
		for(int i = 0; i < arr.length; i++){
			if(max2 < arr_copy[i] && max1 != arr_copy[i] && max != arr_copy[i]){
				max2 = arr_copy[i];
				index_max2 = i;
			}
		}
		
		System.out.println("The 3 elements which absolut value is the biggest:");
		System.out.println(arr[index_max] + " " + arr[index_max1] + " " + arr[index_max2]);
		
		
}
}
