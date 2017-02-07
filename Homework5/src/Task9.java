import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = " ";
		do {
			System.out.println("Enter a string with numbers , latin letters and sign");
			input = sc.nextLine();
		} while (isValid(input) == false);

		input = input.replaceAll("-", " -");
		input = input.replaceAll("[^-?0-9]+", " ").trim();
		int sum = 0;

		String numbers[] = input.split(" ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			sum += Integer.valueOf(numbers[i]);
		}

		System.out.print("Sum is: " + sum);
	}

	public static boolean isValid(String input) {
		if (input == null) {
			return false;
		}

		for (int i = 0; i < input.length(); i++) {
			if (Character.isAlphabetic(input.charAt(i)) == false && (Character.isDigit(input.charAt(i)) == false)
					&& (input.charAt(i) != '-')) {
				return false;
			}

		}
		return true;
	}
}
