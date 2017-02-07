import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of array: ");
		int value = sc.nextInt();
		while (value <= 0) {
			System.out.print("Enter postive number for value: ");
			value = sc.nextInt();
		}
		int[] arr1 = new int[value];
		for (int i = 1; i <= arr1.length; i++) {

			System.out.print("Enter number for" + " " + i + ":");
			int n = sc.nextInt();
			arr1[i - 1] = n;

		}

		int[] arr2 = new int[arr1.length];
		arr2[0] = arr1[0];
		arr2[arr1.length - 1] = arr1[arr1.length - 1];
		for (int i = 1; i < arr1.length - 1; i++) {
			arr2[i] = arr1[i - 1] + arr1[i + 1];
		}
		System.out.print("[");
		for (int i = 0; i < arr1.length; i++) {
			if (i == arr1.length - 1) {
				System.out.print(arr2[i]);
			} else {
				System.out.print(arr2[i] + ",");
			}
		}
		System.out.print("]");
	}

}
