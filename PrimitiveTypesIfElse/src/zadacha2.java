import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {

		Scanner sh = new Scanner(System.in);
		double a, b;
		System.out.println("A:");
		a = sh.nextDouble();
		System.out.println("B:");
		b = sh.nextDouble();

		double sum = a + b;
		double diff = a - b;
		double multiply = a * b;
		double divide = a / b;
		double modulus = a % b;
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(multiply);
		System.out.println(divide);
		System.out.println(modulus);

	}

}
