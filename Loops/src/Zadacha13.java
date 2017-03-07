import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();

		for (int i = 100; i <= 999 & i >= 100; i++) {
			int firstNumber = i % 10;
			int secondNumber = (i / 10) % 10;
			int thirdNumber = i / 100;
			if (num == firstNumber + secondNumber + thirdNumber) {
				System.out.println(i);
			}

		}
	}

}
