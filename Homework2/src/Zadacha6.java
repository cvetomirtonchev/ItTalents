import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number");
		int number = sc.nextInt();
		int a = 0;
		for (int i = 1; i <= number; i++) {
			a += i;
		}
		System.out.println(a);

	}

}
