import java.util.Scanner;

public class Zadacha19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else {
				n = 3 * n + 1;

			}
			System.out.println(n);
		}

	}

}
