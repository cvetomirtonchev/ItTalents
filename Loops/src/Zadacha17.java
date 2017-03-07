import java.util.Scanner;

public class Zadacha17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your symbol: ");
		char a = sc.next().charAt(0);

		System.out.println("Enter your side: ");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			if (i == 0 || i == b - 1) {
				for (int g = 0; g < b; g++) {
					System.out.print("* ");
				}
			}
			if (i != 0 && i != b - 1) {
				System.out.print("* ");
				for (int p = 2; p < b; p++) {
					System.out.print(a + " ");
				}
				System.out.print("*");
			}
			System.out.println();

		}

	}
}