import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array numbers:");
		int num = sc.nextInt();
		int sum;
		int arr1[] = new int[9];
		System.out.print("[");
		arr1[0] = num;
		arr1[1] = num;
		arr1[2] = arr1[0] + arr1[1];
		System.out.print(arr1[0] + "," + arr1[1] + ",");
		for (int i = 2; i < arr1.length; i++) {
			arr1[i] = arr1[i - 1] + arr1[i - 2]; // make magic
			if (i == arr1.length - 1) {
				System.out.print(arr1[i]);
			} else {
				System.out.print(arr1[i] + ",");

			}

		}
		System.out.println("]");
	}

}
