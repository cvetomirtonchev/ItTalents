import java.util.Scanner;

public class Zadacha25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int number = sc.nextInt();
		int a = 1;
		do {
			a *= number;
			number--;
		} while (number != 0);
		System.out.println(a);
	}
}