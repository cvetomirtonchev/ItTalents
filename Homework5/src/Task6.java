import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = " ";
		do {
			System.out.println("Enter a sentence");
			input = sc.nextLine();
		} while (isValid(input) == false);

		input = input.trim().toLowerCase();
		char[] array = input.toCharArray();

		for (int i = 0; i < array.length - 1; i++) {
			if (Character.isWhitespace(array[i])) {
				array[i + 1] = Character.toUpperCase(array[i + 1]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array[i] = Character.toUpperCase(array[i]);
			}
			System.out.print(array[i]);
		}

	}

	public static boolean isValid(String input) {
		if (input == null) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isWhitespace(input.charAt(i)) && (!Character.isAlphabetic(input.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

}