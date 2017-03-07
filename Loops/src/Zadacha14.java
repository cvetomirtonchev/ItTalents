import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		if (num < 200 && num > 10) {
			for (int i = 200; i <= 200 && i >= 10; i--) {
				if (i % 7 == 0 && i <= num) {
					System.out.print("Multiple of 7: " + i + " ");
					System.out.println();
				}

			}
			for (int g = 200; g <= 200 && g >= 10; g--) {
				if (g < num) {
					System.out.print(g + ",");
				}
			}

		}

	}
}