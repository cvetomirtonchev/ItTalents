import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);

		int firstNumber;
		int secondNumber;

		System.out.println("Въведете двуцифрено число");
		firstNumber = ch.nextInt();
		System.out.println("Въведете второ двуцифрено число");
		secondNumber = ch.nextInt();
		int multi = firstNumber * secondNumber;
		int lastDigit = multi % 10;

		if ((multi % 10) == 0)
			System.out.println(multi + "  " + lastDigit + "  " + "Четно");
		else
			System.out.println(multi + "  " + lastDigit + " " + "Нечетно");
	}

}
