import java.util.Scanner;

public class Zadacha15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		int comp = 1;
		int sum = 0;
		do {
			sum = comp + sum;

			comp++;

		} while (comp <= num);
		System.out.println(sum);
	}

}
