import java.util.Scanner;

public class Zadacha24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		int n = num;
		int rev = 0;
		int dig = 0;
		if (num > 10 && num < 30000) {
			while (num > 0) {
				dig = num % 10;
				rev = rev * 10 + dig;
				num = num / 10;
			}

			if (n == rev) {
				System.out.println(rev + " " + "The number is palindrome");
			}

			else {
				System.out.println("not palindrome");

			}
		}
	}
}
