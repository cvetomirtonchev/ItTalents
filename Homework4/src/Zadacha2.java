import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter number for:" + "[" + i + "]" + "[" + j + "]");
				int num = sc.nextInt();

				arr[i][j] = num;
			}
		}
        int n = arr.length-1;
        int sum = 0;
		for (int i = 0;i<arr.length;i++){
			for (int j = 0;j<arr[i].length;j++){
				if(i+j==n){
					System.out.print(arr[i][j] + " ");
				}
				
			
			}
		}
			System.out.println();
		
		for (int i = 0;i<arr.length;i++){
			for (int j = 0;j<arr[i].length;j++){
		
				if ( i==j){
					
					System.out.print(arr[i][j] + " ");
				}
				
			}
	 
		}
		
		
		
	}
}