import java.util.Scanner;

public class Zadacha16 {

	public static void main(String[] args) {

		Scanner ch = new Scanner(System.in);

		int digit;
		System.out.println("�������� ���������� �����");
		digit = ch.nextInt();
		int firstNumber = (digit / 100);
		int secondNumber = ((digit / 10) % 10);
		int thirdNumber = (digit % 10);
		if (firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == thirdNumber)
			System.out.println("������� �� �����");
		if (firstNumber > secondNumber && secondNumber > thirdNumber && firstNumber > thirdNumber)
			System.out.println(" ������� �� � �������� ���");
		if (firstNumber < secondNumber && secondNumber < thirdNumber && firstNumber < thirdNumber)
			System.out.println(" ������� �� � �������� ���");
		else
			System.out.println("������� �� �� ��������");
	}

}
