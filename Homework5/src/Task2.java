import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first, second;
		System.out.println("Enter two word:");
		do {
			System.out.println("Enter first word: ");
			first = sc.next();
		} while (first.length() >10 || first.length() < 5);

		do {
			System.out.println("Enter second word: ");
			second = sc.next();
		} while (second.length() >20 || second.length() < 5);

		String replace = second.substring(0, 5);
		second = second.replace(replace, first.substring(0, 5));
		first = first.replace(second.substring(0, 5), replace);

		System.out.println(first.length() < second.length() ? second.length() : first.length());
		System.out.print(first + " ");
		System.out.print(second);
		System.out.print(replace.substring(0, 20));

	}

}
