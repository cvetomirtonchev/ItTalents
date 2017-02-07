import java.util.Scanner;

public class Zadacha21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number: ");
		int a = sc.nextInt();
		int color;
		int type;
		for (int i = a; i <= 52; i++) {
			color = (i - 1) % 4;
			type = ((i - 1) / 4) % 13;
			switch (type) {

			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				System.out.print(type + 2);
				break;
			case 9:
				System.out.print("J");
				break;
			case 10:
				System.out.print( "Q");
				break;
			case 11:
				System.out.print( "K");
				break;
			case 12:
				System.out.print("A");
				break;
			}
			switch (color) {
			case 0:
				System.out.println(" Спатия");
				break;
			case 1:
				System.out.println(" Каро");
				break;
			case 2:
				System.out.println(" Купа");
				break;
			case 3:
				System.out.println(" Пика");
				break;
			}
		}

	}
}
