import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		int digit;
		System.out.println("�������� ���������� �����");
		digit = ch.nextInt();
		int firstNumber = (digit / 100);
		int secondNumber = ((digit / 10) % 10);
		int thirdNumber = (digit % 10);
		
        
		if (firstNumber == 0 || secondNumber == 0 || thirdNumber == 0)
			System.out.println("�� ���� �� ��� 0 � �������");
		if ((digit%firstNumber)==0 && (digit%secondNumber)==0 && (digit%thirdNumber)==0)
			System.out.println(" ���� �� �� ����� ���� �� �������");
		else
			System.out.println(" �� �� ���� �� ����� ���� �� �������");

	}

}
