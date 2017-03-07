import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value for: " + "[" + i + "]");
			int n = sc.nextInt();
			arr[i] = n;

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 5 == 0 && arr[j] > 5 && j != arr.length - 1) {
				System.out.print("-"+arr[j] );
			}
		}
	}
}
