import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int a = sc.nextInt();
		int sum = 0;
		boolean asd = true;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				asd = false;

				break;
			}
		}
		if (asd) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}

}
