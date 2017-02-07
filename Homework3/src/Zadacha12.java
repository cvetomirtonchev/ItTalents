import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for: " + "[" + i + "]");
			int n = sc.nextInt();
			arr[i] = n;

		}
		int switch1 = 0;
		switch1 = arr[0];
		arr[0] = arr[1];
		arr[1] = switch1;
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2] - arr[3];
		arr[2] = arr[2] - arr[3];

		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4] / arr[5];
		arr[4] = arr[4] / arr[5];
		System.out.print("[");

		for(int i = 0; i < arr.length; i++){
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
