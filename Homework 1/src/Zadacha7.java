import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {

		Scanner sh = new Scanner(System.in);
		int a;
		double b;
		boolean c;

		System.out.println("���");
		a = sh.nextInt();
		System.out.println("����� ���� ���� ?");
		b = sh.nextDouble();
		;
		System.out.println("����� �� ���");
		c = sh.nextBoolean();

		if (c == true)
			System.out.println("�� ��� ����� ���� �� �������");
		if (b > 0 && c == true)
			System.out.println("�� �� ���� ���������");

		if (b == 0 && c == true)
			System.out.println("�� �� ���� ����� � �� ��� ���");
		else if (b > 10 && c == false)
			System.out.println("�� ����� �� ����");
		if (b < 10 && c == false)
			System.out.println("�� ����� �� ����");

	}
}