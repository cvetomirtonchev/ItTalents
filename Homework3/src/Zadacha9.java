import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for the array: ");
		int value = sc.nextInt();
		while ( value<=0){
			System.out.print("Enter postive number for value: ");
			value = sc.nextInt();
		}
		int []arr = new int[value];
		for ( int i = arr.length-1;i>=0;i--){
			System.out.print("Enter number: ");
			int n = sc.nextInt();
			arr[i]=n;
		}
        System.out.print("[");
        for ( int i =0; i<arr.length;i++){
            if (i!=arr.length-1){
            	System.out.print(arr[i]+",");
            }
            else {
            	System.out.print(arr[i]);
            }
        }
        System.out.print("]");
		
	}

}
