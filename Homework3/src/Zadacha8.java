import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please, enter the value of the array: ");
		int size = sc.nextInt();

		while (size <= 0) {
			System.out.print("Enter positive number: ");
			size = sc.nextInt();
		}

		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Please, enter the element of the array: " + "["+i+"]");
			arr[i] = sc.nextInt();
		}

		int count = 1;
		int count_max = 1;
		int index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > count_max) {
				count_max = count;
				index = i + 1;
			}
		}

		System.out.println("The longest row of equal elements is: ");
		for (int i = index; i > index - count_max; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}