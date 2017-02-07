import java.util.Scanner;

public class Zadacha16 {

	public static void main(String[] args) {

		Scanner ch = new Scanner(System.in);

		int digit;
		System.out.println("Въведете трициферно число");
		digit = ch.nextInt();
		int firstNumber = (digit / 100);
		int secondNumber = ((digit / 10) % 10);
		int thirdNumber = (digit % 10);
		if (firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == thirdNumber)
			System.out.println("Числата са равни");
		if (firstNumber > secondNumber && secondNumber > thirdNumber && firstNumber > thirdNumber)
			System.out.println(" Числата са в възходящ ред");
		if (firstNumber < secondNumber && secondNumber < thirdNumber && firstNumber < thirdNumber)
			System.out.println(" Числата са в низходящ ред");
		else
			System.out.println("Цифрите са не наредени");
	}

}
