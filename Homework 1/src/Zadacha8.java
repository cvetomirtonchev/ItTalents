import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		int number;
		System.out.println("�������� 4-�� ������� �����");
		number = ch.nextInt();
		if (1000 > number  && 9999 > number)
			System.out.println("���� ������ �����");
		
		int firstNumber = ((number / 1000) * 10) + (number % 10);
		int secondNumber = (((number / 100) % 10) * 10) + ((number / 10) % 10);

		if (firstNumber < secondNumber)
			System.out.println(firstNumber + "<" + secondNumber);
		if (firstNumber > secondNumber)
			System.out.println(firstNumber + ">" + secondNumber);
		if (firstNumber == secondNumber)
			System.out.println(firstNumber + "=" + secondNumber);

	}

}
