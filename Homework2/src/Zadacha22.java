import java.util.Scanner;

public class Zadacha22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number = sc.nextInt();
		int a = 0;
		int i = number;
		if (number > 1 && number < 999) {
			while (a != 10) {
				if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 && i > number) {
					a++;
					System.out.println(a + ":" + i);
				}
				i++;
			}

		}
	}
}