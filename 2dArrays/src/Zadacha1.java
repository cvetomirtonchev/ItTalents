import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[6][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter number for:" + "[" + i + "]" + "[" + j + "]");
				int num = sc.nextInt();

				arr[i][j] = num;

			}
		}

		int min = arr[0][0];
		int max = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					continue;
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
