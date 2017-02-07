import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();

		int space = number - 1;
		int starsCounter = -1;

		StringBuilder romb = new StringBuilder();

		for (int i = 1; i <= number; i++, space--, starsCounter += 2) {
			for (int j = 0; j < space; j++) {
				romb.append(" ");
			}
			romb.append(i);
			for (int k = 0; k < starsCounter; k++)
				romb.append("*");
			if (i > 1) {
				romb.append(i);
			}
			romb.append("\n");
		}

		space = 1;
		starsCounter -= 4;

		for (int i = number - 1; i >= 1; i--, space++, starsCounter -= 2) {
			for (int j = 0; j < space; j++) {
				romb.append(" ");
			}
			romb.append(i);

			for (int k = 0; k < starsCounter; k++) {
				romb.append("*");

			}
			if (i > 1) {
				romb.append(i);
			}
			romb.append("\n");
		}
		System.out.println(romb);
	}

}
