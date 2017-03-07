import java.util.Scanner;

public class Zadacah10 {

	public static void main(String[] args) {
		Scanner ch = new Scanner(System.in);
		int firstBucket = 2;
		int secondBucket = 3;
		int l;
		System.out.println("Въведете обема");
		l = ch.nextInt();

		if ((l < 10) || (l > 9999))
			System.out.println(" Няма такъв обем");
        if ((l>10)||(l<9999));
		int obem = (l / (firstBucket + secondBucket));
		int ostatuk = (l % (firstBucket + secondBucket));

		System.out.println(obem + " пъти по " + firstBucket + " литра");
		System.out.println(obem + " пъти по " + secondBucket + " литра");
		System.out.println("Допълнителна кофа " + ostatuk + " литра");

	}

}
