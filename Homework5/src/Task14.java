import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
		String text1 = "";

		do {
			System.out.println("Enter text");
			text1 = sc.nextLine();
		} while (isValid(text1) == false);

		int counters[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < text1.length(); i++) {
			if (!Character.isAlphabetic(text1.charAt(i))) {
				continue;
			}
			int index = text1.toLowerCase().charAt(i) - 'a';
			counters[index]++;
		}

		for (int i = 0; i < counters.length; i++) {
			System.out.println((char) ('a' + i) + " - " + counters[i]);
		}

		int maxIndex = 0;
		for (int i = 0; i < counters.length; i++) {
			if (counters[i] > counters[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println(" The symbol whis is most often in the text is :" + (char) (maxIndex + 'a'));

	}

	public static boolean isValid(String input) {
		if (input == null) {

			return false;

		}
		for (int i = 0; i < input.length(); i++) {
			if (!Character.isAlphabetic(input.charAt(i)) && (!Character.isWhitespace(input.charAt(i)))) {

				return false;
			}
		}
		return true;
	}
}
