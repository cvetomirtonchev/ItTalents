import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {

		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("A:");
		a = sc.nextDouble();
		System.out.println("B:");
		b = sc.nextDouble();
		System.out.println("C:");
		c = sc.nextDouble();

		if (c > a && c < b)
			System.out.println(c + " is between " + a + " and " + b);
		else
			System.out.println(c + " is not between " + a + " and " + b);

	}

}
