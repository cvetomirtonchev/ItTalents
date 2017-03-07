import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of array: ");
		int vol = sc.nextInt();
		int arr1[] = new int[vol];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Enter your number: ");
			int n = sc.nextInt();
			arr1[i] = n;

		}
		int arr2[] = new int[arr1.length];
		for (int i = arr1.length - 1; i >= 0; i--) {

			for (int j = 0; j < arr1.length; j++) {
				arr2[j] = arr1[i];
				i--;

			}
			break;

		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {

				System.out.println("The array are not  windowed");
				break;
			} else {
				if (arr1[i] == arr2[i])
					System.out.println("The array are  windowed");
				break;

			}

		}

	}
}
