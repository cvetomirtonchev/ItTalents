import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colons");
		int n = sc.nextInt();
		int spaces = n - 1;
		int stars = 1;
		for (int row = 0; row < n; row++) {
			for (int i = 0; i < spaces; i++) {
				System.out.print(" ");
			}
			for (int g = 0; g < stars; g++) {
				System.out.print("*");
			}
			spaces--;
			stars += 2;
			System.out.println();
		}

	}

}
