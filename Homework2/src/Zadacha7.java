import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int number = sc.nextInt();

		for (int i = 3; i <= 3 * number; i += 3) {
			System.out.println(i);

		}
	}

}
