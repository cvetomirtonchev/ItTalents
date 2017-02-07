import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		int sum = number - 1;
		for (int i = 1; i <= number; i++) {
			for (int y = 1; y <= number; y++) {
				System.out.println(sum);
				
			}
			System.out.println(sum);
			sum += 2;
		}

	}

}
