import java.util.Scanner;

public class Zadacah10 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		int firstBucket = 2;
		int secondBucket = 3;
		int l;
		System.out.println("�������� �����");
		l = ch.nextInt();

		if ((l < 10) || (l > 9999))
			System.out.println(" ���� ����� ����");
        if ((l>10)||(l<9999));
		int obem = (l / (firstBucket + secondBucket));
		int ostatuk = (l % (firstBucket + secondBucket));

		System.out.println(obem + " ���� �� " + firstBucket + " �����");
		System.out.println(obem + " ���� �� " + secondBucket + " �����");
		System.out.println("������������ ���� " + ostatuk + " �����");

	}

}
