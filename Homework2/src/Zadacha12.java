
public class Zadacha12 {

	public static void main(String[] args) {

		for (int i = 100; i <= 999 && i >= 100; i++) {
			int firstNumber = i % 10;
			int secondNumber = (i / 10) % 10;
			int thirdNumber = i / 100;
			if (firstNumber != secondNumber && thirdNumber != firstNumber && secondNumber != thirdNumber) {
				System.out.println(i);
			}

		}

	}

}
