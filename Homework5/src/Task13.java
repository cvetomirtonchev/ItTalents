import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text1 = "";
		String text2 = "";

		do {
			System.out.println("Enter text 1 with letters that do not repeat");
			text1 = sc.nextLine();
		} while (isValidFirstInput(text1) == false);

		do {
			System.out.println("Enter text 2 ");
			text2 = sc.nextLine();
		} while (isValidSecondInput(text2) == false);

		String result = checkDifference(text1, text2);

		if (result.equals("")) {
			System.out.println("The two texts are the same");
		} else {
			System.out.println(result);
		}
	}

	public static boolean isValidFirstInput(String input) {
		if (input == null) {
			// System.err.println("Test point 1 ...");
			return false;

		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i))) {
				// System.err.println("Test point 2 ...");
				return false;
			}
		}

		int counters[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < input.length(); i++) {
			int index = Character.toLowerCase(input.charAt(i)) - 'a';
			counters[index]++;
		}

		for (int c = 0; c < counters.length; c++) {
			if (counters[c] > 1) {
				// System.err.println("Test point 3 ...");
				return false;
			}
		}

		// System.err.println("Test point 4 ...");
		return true;
	}

	public static boolean isValidSecondInput(String input) {
		if (input == null) {
			// System.err.println("Test point 5 ...");
			return false;

		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i))) {
				// System.err.println("Test point 6 ...");
				return false;
			}
		}
		return true;
	}

	public static String checkDifference(String string1, String string2) {

		int counters1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < string1.length(); i++) {
			int index = Character.toLowerCase(string1.charAt(i)) - 'a';
			counters1[index]++;
		}
		int counters2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < string2.length(); i++) {
			int index = Character.toLowerCase(string2.charAt(i)) - 'a';
			counters2[index]++;
		}

		StringBuilder list = new StringBuilder("");
		boolean identical = true;
		for (int i = 0; i < counters2.length; i++) {
			if (counters1[i] == 0 && counters2[i] != 0) {
				identical = false;
			}
			if (counters1[i] != 0 && counters2[i] == 0) {
				identical = false;
				list.append((char) ('a' + i));
			}
		}

		if (identical == true) {
			return "";
		} else {
			return list.toString();
		}
	}

}
