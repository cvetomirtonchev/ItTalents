import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one numer: ");
		int number = sc.nextInt();

		number = fibonacci(number);
		System.out.println("Your fibonacci number is: " + number);

	}

	static int fibonacci(int n) {
		if (n == 1) {
			return 1;

		}
		if (n == 2) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
